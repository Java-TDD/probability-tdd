# Probability

## Requirement 1: 
As a statistician, I want to know the probability of getting a head and tail in a coin toss is equal.

### Testcase:
- Create object for the probability of head and for probability of tail and pass the values.
- Check whether both of the object are equal

### Codebase:
- We override the `equals()` method since, `equalTo()` method in hamcrest used the `equals()` method to check the equality.
- We define our rules for the `equals()` method, here we compare the two object along with its value.
- Since we override the `equals()` method, it is non written rule that, we should also override the hashcode to change the definition.
- Hashcode basically creates the hashcode for the object and `equals()` use this hashcode to compare the objects.
- Here we changed the `equals()` definition to check the object and its value but, hashcode remains different for both of these objects which is inconsistent.
- To solve this inconsistency, we override the `hashcode()` method to create the hashcode for the passed value of the object.


## Requirement 2:
As a statistician, I want to be able to know the probability of two events occurring together.

### Testcase:
- Create two objects for probability of certain events.
- Then we write test case to find the probability of the events occurring together.
- Probability of Two certain events occurring together is equal to a probability of certain event

### Codebase:
- We implement the method to find the union of the two events (occurring together);
- Implement the `and()` method to find the union of two events.
- P(AUB) = P(A) * P(B)