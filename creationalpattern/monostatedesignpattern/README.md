# Monostate Design Pattern
The intent of Singleton is to ensure that only a single instance of an entity is created, which in turn ensures a single state of that entity which can be shared across threads. But, sharing the only instance we have brings synchronization into picture.
Monostate overcomes this problem by simply allowing more than one instances to be created, while maintaining a single state.
Singleton’s constructor is private to prevent explicit object creation. Since, in monostate we want to allow object creation for two threads, we want more than one instance. One for each thread. Thus, we make the constructor public.
Setters and getters remain the same, as they are the ones which update and fetch the state
