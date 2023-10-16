numberOfSyllables, numberOfPlayers = list(map(int, input().split()))

# State
# 0 = Folded
# 1 = Fist
# 2 = Palm

# Create player object
class Player:
    def __init__(self, playerNumber, state):
        self.playerNumber = playerNumber 
        self.state = state
        
# Intialise Game
players = []
for i in range(1, numberOfPlayers + 1):
    players.append(Player(i,0))
nextPlayer = 0

# Play game
while True:
    nextPlayer = (nextPlayer + numberOfSyllables - 1) % len(players)
    player = players[nextPlayer]
    if player.state == 0:
        #del players[nextPlayer]
        players.pop(nextPlayer)
        players.insert(nextPlayer, Player(player.playerNumber,1))
        players.insert(nextPlayer, Player(player.playerNumber,1))
    elif players[nextPlayer].state == 1:
        players[nextPlayer].state = 2
        nextPlayer = (nextPlayer + 1) % len(players)
    elif players[nextPlayer].state == 2:
        #del players[nextPlayer]
        players.pop(nextPlayer)
    if len(players) == 1:
        winner = players[0].playerNumber
        break

print(winner) 
    
    
    