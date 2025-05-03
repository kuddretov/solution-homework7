# Solution-Homework-7

##  Part 1: Iterator Pattern — "Streaming‑Service Binge Mode" ##

### Description:Simulates a small Netflix-like platform where a TV series consists of multiple seasons, and each season contains episodes stored in various ways. The system supports:
###
Normal episode order 

Reverse episode order

Shuffled episode order (with fixed seed)

Highlights:

EpisodeIterator interface hides collection implementation

Season implements Iterable<Episode> for for-each compatibility

Series class provides a BingeIterator to watch all episodes across all seasons without switching manually

Why Iterator was used:
Allows the UI or client code to iterate over episodes without knowing or caring about how they are stored internally. Makes the design flexible, modular, and easy to extend.

## Part 2: Mediator Pattern — "Airport Tower Simulator" ##
### Description:Simulates an airport control tower system where different types of aircraft (passenger planes, cargo planes) request access to a single runway. Communication is fully centralized through a ControlTower acting as the Mediator.
###
Highlights:

All aircraft communicate through TowerMediator

ControlTower handles runway access requests

Emergency protocol supported (MAYDAY) to clear the runway and prioritize landing

Why Mediator was used:
Avoids complex direct interactions between aircraft. Centralizes logic and improves maintainability, scalability, and code clarity.
