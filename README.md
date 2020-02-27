# Football League Model
Models the relationship between Footballers, Clubs, Leagues and more, exhibiting Java's object-oriented principles.

### General Overview
I have defined a League by having a name, nationality, a number of clubs, a pointer to a lower league, and a table. The main attribute is the table, which is a list of clubs. 

A Club is defined by first having an enum called ClubCode, which is a unique identifier that prevents the duplication of a club definition. A club also has an Owner, a Chairman, a Manager, a playerRegistry, and LeagueStats. The most important attributes are the playerRegistry, which is a map from a kit number to a Footballer, and the LeagueStats which is an object containing information about the performance of this club for the current season. The playerRegistry is what allows a Club object to access information about who plays for the team. 

A Footballer is an abstract class which is subdivided into a FieldPlayer and a Goalkeeper, the former being another abstract class. A footballer has a Role which is an enum that defines the specific position this player plays. A footballer also has FootballerAttributes, which is an abstract class that is parallel to the Footballer hierarchy. The only attribute for FootballerAttributes is speed. A Goalkeeper has GoalkeeperAttributes, which add the attributes, distribution, diving, drop, footwork, and handling. On the other side, FieldPlayerAttributes have agility, flair, heading, passing, shooting, strength, touch, weakFoot, oWorkrate, and dWorkrate. All of these “attributes” are actually generic Attribute options, all configured to an int. The main reason for making an attribute object is to guarantee the max value for any of these is 10 and the minimum value is 1. FieldPlayer/FieldPlayerAttributes are divided into 3 non-abstract classes, Forward/ForwardAttributes, Midfielder/MidfielderAttributes, and Defender/DefenderAttributes. Each adding 3 more unique attributes. These attributes are used to define a player’s skill. 

Moving away from this hierarchy, we have a Singleton Observer, ClubRegistry, which updates its ClubCode to Club map every time a unqiue Club is instantiated. This class is used to get information about a club from the ClubCode identifier.

This project defines the major components of what makes a football league, a football club, and a footballer, with appropriate relationships between them. With the FootballerAttribute system, a simple simulation could easily be made with this model.
