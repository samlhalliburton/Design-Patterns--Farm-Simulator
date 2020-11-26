# slhallib-SER316-DesignPatterns

>Link to Screencast: 

## Design Pattern Plans ##
> For this assignment, the following design patterns were implemented:

### Factory Pattern ###
> This pattern is a creational design pattern that provides an interfaces for creating families of classes.
>> The requirements met by this pattern were: 
>>> - Starts with at least 1 farm.
>>> - Farms can be of different types, such as an animal farm, a crop farm, a hybrid farmand so on.
>>> - The simulation should run on cycles. A cycle is considered to be of 2 parts - 1 day time and 1 night time.
>>> - More currency can be made from farmer, animal or crop affinities

### Decorator Pattern ###
> This pattern is a structural design pattern that wraps objects within new behaviors by appending them to the existing object.
>> The requirements met by this pattern were:
>>> - Farmers can have affinities for things such as (these are some examples to give you ideas): Being better at growing crops, Being better at rearing animals, Possess a certain money-making skill.
>>> - Similar to farmers, animals have affinities too (these are some examples to give you ideas): A horse could be especially fast (higher chance for a person to win a race), A cow may be larger than usual and produce more milk, A sheep may produce more wool.
>>> - Crops may be harvested 1 time every 3 cycles.

### Facade Pattern ###
> This pattern is a structural design pattern that takes a complex sub-system and turns it into a simplified interface. This makes it much easier to call one or two methods versus needing make sure many methods are called in the correct order.
>> The requirements met by this pattern were:
>>> - During night cycles predators come out. Predators could be foxes or wolves that may attack/eat the animals. Predators could also be rabbits or some other animal that eats crops. Predators could also be moles that damage the soil.
>>> - Passive currency is earned with each new day (not night). This passive currency income is generated from selling crops or animal products, or both depending on your farm.
>>> - Animal product (milk, wool, and so on) is replenished after every 2nd day. For example, if a sheep is sheared for its wool then the farmers must wait 2 cycles (day and night) to collect the wool again.
