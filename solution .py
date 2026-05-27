from collections import Counter
from extratypes import Results  # Library with types used in the task

def rank_value(rank):
    rank_order = {'2': 2, '3': 3, '4': 4, '5': 5, '6': 6, '7': 7, '8': 8, '9': 9, '10': 10,
                  'J': 11, 'Q': 12, 'K': 13, 'A': 14}
    return rank_order[rank]

def solution(cards):
    rank_map = Counter()
    suit_map = Counter()
    rank_to_cards = {}
    suit_to_cards = {}

    for card in cards:
        rank, suit = card[:-1], card[-1] 
        rank_map[rank] += 1
        suit_map[suit] += 1
        rank_to_cards.setdefault(rank, []).append(card)
        suit_to_cards.setdefault(suit, []).append(card)

    # Sort ranks in descending order for easier selection
    sorted_ranks = sorted(rank_map.keys(), key=rank_value, reverse=True)

    # Check for "a triple and a pair"
    triple, pair = None, None
    for rank in sorted_ranks:
        count = rank_map[rank]
        if count >= 3 and not triple:
            triple = rank
        elif count >= 2 and not pair:
            pair = rank

    if triple and pair:
        return Results("a triple and a pair", rank_to_cards[triple][:3] + rank_to_cards[pair][:2])

    # Check for "suit" (Flush) - Select highest five cards of the most frequent suit
    for suit, count in suit_map.items():
        if count >= 5:
            return Results("suit", sorted(suit_to_cards[suit], key=lambda c: rank_value(c[:-1]), reverse=True)[:5])

    # Check for "five in a row" (Straight)
    for i in range(len(sorted_ranks) - 4):
        consecutive_cards = [sorted_ranks[i + j] for j in range(5)]
        if all(rank_value(consecutive_cards[j]) - rank_value(consecutive_cards[j + 1]) == 1 for j in range(4)):
            return Results("five in a row", [rank_to_cards[rank][0] for rank in consecutive_cards])

    # Handle Ace-low straight (A, 2, 3, 4, 5)
    if all(rank in rank_map for rank in ["A", "2", "3", "4", "5"]):
        return Results("five in a row", [rank_to_cards[rank][0] for rank in ["5", "4", "3", "2", "A"]])

    # Check for "triple"
    for rank in sorted_ranks:
        if rank_map[rank] >= 3:
            return Results("triple", rank_to_cards[rank][:3])

    # Check for "pair"
    for rank in sorted_ranks:
        if rank_map[rank] >= 2:
            return Results("pair", rank_to_cards[rank][:2])

    # Default to "single card" (Highest-ranked card)
    highest_card = max(cards, key=lambda card: (rank_value(card[:-1]), "SHDC".index(card[-1])))
    return Results("single card", [highest_card])