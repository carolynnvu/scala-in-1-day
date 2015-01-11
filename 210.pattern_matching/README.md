Pattern Matching Example

One of the more interesting use cases for pattern matching in Scala and other
functional languages, is for simplifying the visitor pattern.

Wikipedia describes the visitor pattern:

    "In object-oriented programming and software engineering, the visitor design
    pattern is a way of separating an algorithm from an object structure on
    which it operates. A practical result of this separation is the ability to
    add new operations to existing object structures without modifying those
    structures. It is one way to follow the open/closed principle." -
        http://en.wikipedia.org/wiki/Visitor_pattern

A simple example of the visitor pattern in Java is described here:

http://java.dzone.com/articles/design-patterns-visitor

In this repo I've created a similar example, to demonstrate how one might
separate the computation of tax based on the nature of an item, from the
definition of the item itself. This is a good way to insulate the core data
model from changes over time -- for example tax rules may change, or grow as
part of international expansion, or a host of other issues.

The visitor pattern is sometimes described as a language failure. The problem
is that there is a lot of machinery required to get the implementation
relatively clean. Things need to be visitable, there needs to be a visitor,
that visitor needs to change as the data model grows, and the actual
logic-per-type is in a method-per-type and sometimes a class-per-type. But very
often it's useful to have the relevant data (e.g., tax codes) in one place in
the code.

The scala version of this example shows how pattern matching can be used to
simplify the visitor model dramatically. In this case both examples are fairly
simple, but as the system grows more complex, the java visitors grow in
complexity, typically, much faster than the scala version.

Here are some links demonstrating richer examples:

http://stackoverflow.com/questions/8618082/visitor-pattern-in-scala
http://andymaleh.blogspot.ie/2008/04/scalas-pattern-matching-visitor-pattern.html

There is a great academic paper by Burak Emir, Martin Odersky and John Williams
that's worth a read if you're interested in the theory behind pattern matching:

http://lampwww.epfl.ch/~emir/written/MatchingObjectsWithPatterns-TR.pdf
