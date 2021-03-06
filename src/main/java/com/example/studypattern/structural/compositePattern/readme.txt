组合（Composite）模式：组合多个对象形成树形结构以表示具有“整体-部分”关系的层次结构。
组合模式对单个对象（即叶子对象）和组合对象（即容器对象）的使用具有一致性，组合模式又可以称为“部分-整体”（Part-Whole）模式，
它是一种对象结构型模式。

组合模式包含以下几个角色：

　　（1）Component（抽象构件）：它是接口或抽象类，为叶子构件和容器构件对象声明接口，在该角色中可以包含所有子类共有行为的声明和实现。
在抽象构件中定义了访问及管理它的子构件的方法，例如增加子构件、删除子构件、获取子构件等。

　　（2）Leaf（叶子构件）：它在组合模式中表示叶子结点对象，叶子结点没有子节点，它实现了在抽象构件中定义的行为。

　　（3）Composite（容器构件）：它在组合模式中表示容器节点对象，容器节点包含子节点，其子节点可以使叶子结点，也可以是容器节点，
它提供一个集合用于存储子节点，实现了在抽象构件中定义的行为。

4.1 主要优点
　　（1）可以清楚地定义分层次的复杂对象，表示对象的全部或部分层次，使客户忽略了层次的差异，方便对整个层次结构进行控制。

　　（2）增加新的容器构件和叶子构件都十分方便，无需对现有类库代码进行任何修改，符合开闭原则。

　　（3）为树形结构的面向对象实现提供了灵活地解决方案，可以形成复杂的树形结构，但对树形结构的控制却很简单。

4.2 主要缺点
　　增加新构件时很难对容器中的构建类型进行限制。

4.3 适用场景
　　（1）在具有整体和部分的层次结构中，希望通过一种方式忽略整体与部分的差异，客户端可以一致地对待他们。

　　（2）在一个使用面向对象语言开发的系统中需要处理一个树形结构。