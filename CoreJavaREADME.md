# CoreJava
​	Java 核心技术卷一 (第十版)

## 第三章

### 3.3 数据类型

#### 3.3.1 整型

​	*0x*前缀表示*16*进制，*0b*前缀表示*2*进制，*0*前缀表示*8*进制，*8*进制表示法比较容易混淆。

#### 3.3.3 *char*类型

​	*\u*是一个转义序列，可以出现在**加引号的字符字面量或字符串**中。*\u*后面跟着四个*16*进制数来表示一个*Unicode*字符。

### 3.5.2 数值类型之间的转换

​	两个不同类型的数值进行二元操作时，先要将两个操作数转换为同一种类型，然后再进行计算。

- 有*double*转成*double*
- 否则，有*float*转成*float*
- 否则，有*long*转为*long*
- **否则两个操作数都会被转为*int***

#### 3.5.3 强制类型转换

​	**强制类型转换可能会导致信息丢失。** 只有极少数的情况下才需要将布尔类型转换为数值类型，这时可以使用条件表达式 *b ? 1 : 0*;

#### 3.5.4 结合赋值和运算符

​	可以在赋值中使用二元运算符，如： *x += 4;* 等价于 *x = x + 4;* **如果运算符得到的一个值，其类型与左侧操作数的类型不同，就会发生强制类型转换。如果*x*是*int*，则 *x += 3.5* 是合法的，将把*x*设置为 *(int)(x + 3.5);***

#### 3.5.5 自增与自减运算符

```java
// 后缀形式
i++;
// 前缀形式
++i;
在表达式中，两者存在区别。前缀形式会先完成 + 1, 后缀形式会使用变量原来的值。
int m = 7;
int n = 7;
// a = 16, m = 8
int a = 2 * ++m;
// b = 14, n = 8
int b = 2 * n++;
```

#### 3.5.6 关系和*boolean*运算符

​	使用*&&*和*||*表示与运算和或运算，它们是按照*”短路“*方式来求值的： **如果第一个操作数已经能够确定表达式的值，第二个操作数就不必计算了。** 对于与运算来说，第一个为*false(0)*则不必再进行计算，对于或运算第一个为*true(1)*则不必再进行计算。

### 3.6.3 不可变字符串

​	由于不能修改*Java*字符串中的字符，所以在Java文档中将*String*类对象称为*不可变字符串*。**不可变字符串使得编译器可以让字符串共享。**

### 3.8.4 确定循环

​	一般情况下，如果从*n*个数字中抽取*k*个数字，就可以使用下列公式得到结果

​			**( n * (n - 1) * (n - 2) * … * (n - k + 1)  ) / 1 * 2 * 3 * … * k** 

下面的for循环语句计算了上面这个公式的值

```java
int lottery = 1;
for (int i = 1; i <= k; i++) {
    lottery = lottery * (n - i + 1) / i;
}
```

#### 3.8.6 中断控制流程语句

​	*Java*提供一种带标签的*break*语句，用于跳出多重嵌套的循环语句。**标签必须放在希望跳出的最外层循环之前， 并且必须紧跟一个冒号。**

```java
read_data:
while() {
    for() {
        if() {
            break read_data;
        }
    }
}
```

​	*continue*与*break*语句一样，它将中断正常的控制流程。***continue*语句将控制转移到最内层循环的首部。**

```java
for() {
    if(n < 0) {
        continue;
    }
    // n < 0的话就不执行
    sum += n;
}
```

​	还有一种带标签的*continut*语句，将跳到与标签匹配的循环内部。

### 3.9 大数值

​	如果基本的整数和浮点精度不能够满足需求，那么可以使用*java.math*包中的两个类：*BIgInteger*和*BigDecimal*。这两个类可以处理包含任意长度数字序列的数值。

​	不能使用算术运算符处理大数值，而需要使用大数值类中的方法如*add*，*subtract*方法等来进行算术。

​	**为了防止精度损失，禁止使用构造方法*BigDecimal(double)*的方式把*double*值转为*BigDecimal*对象。**

### 3.10 数组

​	**创建一个数字数组时，所有的元素都初始化为*0*。*boolean*数组的元素会初始化为*false*。对象数组的元素则初始化为一个特殊值*null*，这表示这些元素（还）未存放任何对象。**

##### 3.10.3 数组拷贝

​	如果希望将一个数组的所有值拷贝到一个新的数组中去，就要使用*Arrays*类的*copyOf*方法。这个方法通常用来增加数组的大小。

## 第四章 对象与类

### 4.1 面向对象程序设计概述

​	**面向对象的程序是由对象组成的，每个对象包含对用户公开的特定功能部分和隐藏的实现部分。**<u>从根本上说，只要对象能够满足要求，就不必关心其功能的具体实现过程。在*OOP*中，不必关心对象的具体实现，只要能够满足用户的需求即可。</u>**在*OOP*中，数据是第一位的，然后再考虑操作数据的算法。**（先考虑数据结构，其次是算法）

### 4.2.2  *Java*类库中的*LocalDate*类

- *LocalDate*只提供日期不提供时间信息，它是不可变类且线程安全的
- *LocalTime*只提供时间而不提供日期信息，它是不可变类且线程安全的
- *LocalDateTime*提供时间和日期的信息，它是不可变类且线程安全的

### 4.3.4 从构造器开始

- 构造器与类同名
- 每个类可以有一个以上的构造器
- 构造器可以有*0*个、*1*个或多个参数
- 构造器没有返回值
- 构造器总是伴随着*new*操作一起调用

#### 4.3.6 封装的优点

​	**注意不要编写返回引用可变对象的访问器方法。**

```java
class Employee {
    private Date hireDay;
    
    public Date getHireDay() {
        // bad
        return hireDay;
    }
}
```

​	该类违反了这个设计原则，其中的*getHireDay*返回了一个*Date*类对象。*LocalDate*类没有更改器方法，与之不同，*Date*类有一个更改器方法*setTime*，可以在这里设置毫秒值。***Date*对象是可变的，这一点就破坏了封装性！**

```java
Employee harry =  ...;
Date d = harr.getHireDay();
double tenYearsInMilliSeconds = 10 * 365.25 * 24 * 60 * 60 * 1000;
d.setTime(d.getTime() - (long) tenYearsInMilliSeconds);
```

​	***d*和*harry.hireDay*将引用同一个对象。对*d*调用更改器方法就可以自动地改变这个雇员对象的私有状态！（该雇员的*hireDay*也会随着d的改变而改变）**

​	**如果需要返回一个可变对象，应该首先对它进行克隆。**

```java
class Employee {
    public Date getHireDay() {
        return (Date) hireDay.clone();
    }
}
```

#### 4.3.7 基于类的访问权限

​	**一个方法可以访问所属类的所有对象的私有数据。**

#### 4.3.9 *final* 实例域

​	被*final*修饰的实例域（属性）必须被初始化（直接赋值或构造器中赋值）。也就是说，必须确保在每一个构造器执行之后，这个域的值被设置，并且在后面的操作中，不能够再对它进行修改。因为在对象构建之后，这个值不会再被修改，即没有*set*方法。

​	**对于基本类型，*final*使数值恒定不变；对于引用类型，*final*使引用恒定不变。** 一旦引用被初始化指向一个对象，就无法再把它改为指向另一个对象。然而，对象其自身确是可以被修改的。

### 4.4 静态域与静态方法

##### 4.4.1 静态域

​	静态域被称为类域，**它属于类而不属于任何独立的对象。一个类的所有实例将共享同一个静态域。**

##### 4.4.3 静态方法

​	**静态方法没有隐式的参数。** 可以认为静态方法是没有this参数的方法（在一个非静态方法中，this参数表示这个方法的隐式参数）

​	在下面两种情况下使用静态方法：

- 一个方法不需要访问对象状态，其所需参数都是通过显示参数提供
- 一个方法只需要访问类的静态域

##### 4.4.4 工厂方法

​	静态方法还有另外一种常见的用途，使用静态工厂方法来构造对象。使用静态工厂方法来构造对象有如下好处：

- 可以命名。**构造器无法命名，构造器的名字必须与类名相同。**使用静态工厂方法可以任意命名
- 可以返回其他类型。**当使用构造器时，无法改变所构造的对象类型。**而静态工厂方法可以返回其他类对象（多态）

##### 4.4.5 *main*方法

​	***main*方法不对任何对象进行操作。事实上，在启动程序时还没有任何一个对象。**静态的*main*方法将执行并创建程序所需要的对象。

### 4.5 方法参数

​	如果一个形参是值参*（call by value）*， 调用单元将把实参的一个副本传递给子程序。如果一个形参是引用参数（*call by reference）*，调用单元将把实参的地址传递给子程序。**Java程序设计语言总是采用按值调用。** 也就是说，**方法得到的是所有参数值得一个拷贝，特别是，方法不能修改传递给它的任何参数变量的内容。**

```java
double percent = 10;
harry.raiseSalary(percent);
```

不必理睬*raiseSalary*的具体实现，方法调用过后，*percent*的值还是*10*

​	**对象引用作为参数也会进行拷贝，拷贝的是一个对象的引用。拷贝后的引用和原引用指向的是同一个对象。**

​	总结一下*Java*中**方法参数**的使用情况：

- 一个**方法**不能修改一个基本数据类型的参数（原值不会被修改）
- 一个**方法**可以改变一个对象参数的状态
- 一个**方法**不能让对象参数引用一个新的对象（原引用不会被修改）

### 4.6 对象构造

##### 4.6.1 重载

​	**如果多个方法有相同的名字，不同的参数便产生了重载。方法的返回类型不是方法签名的一部分。** 也就是说，不能有两个名字相同，参数相同而返回值类型不同的方法。

##### 4.6.2 默认域初始化

​	如果在构造器中没有显示地给域赋予初始值，那么就会被自动地赋为默认值：数值为*0*、布尔值为*false*、对象引用为*null*。**这是域与局部变量的主要区别。局部变量必须明确地在方法中初始化！但是，如果没有初始化类中的域，将会被自动初始化为默认值。**

##### 4.6.6 调用另一个构造器

​	如果构造器的**第一个语句形如*this(…)***，这个构造器将调用同一个类的另一个构造器。

```java
public Employee(double s) {
    // calls Employee(String, Double)
    this("Employee #" + nextId, s);
    nextId++;
}
```

##### 4.6.7 初始化块

###### 非静态初始化块

​	**基本跟构造函数一个功能，但比构造函数先执行。**最常见的用法应该还是**代码复用**，即多个重载构造函数都有若干段相同的代码，那么可以把这些重复的代码拉出来放到初始化块中，但仍然要注意它的执行顺序，对顺序有严格要求的初始化代码就不适合使用了。

​	下面是调用**构造器**的具体处理步骤：

1. 所有数据域被初始化为默认值
2. 按照在类中申明中出现的次序，**依次执行所有域初始化语句和初始化块**
3. 如果构造器第一行调用了第二个构造器，则执行第二个构造器主体
4. 执行这个构造器的主体

总结：

1. 静态初始化块的优先级最高，最先执行，**仅在类第一次加载时被执行（仅执行一次）**
2. 非静态初始化块和构造函数后执行，并且在每次生成对象时执行一次
3. 静态初始化块既可以用于初始化静态域，也可以执行初始化代码
4. 非静态初始化块可以针对多个重载构造函数进行代码复用

### 4.7.1 类的导入

​	如果需要导入两个不同包下的同名类，需要在每个类名前面加上完整的包名。

#### 4.7.4 包作用域

​	可以通过**包密封机制**来解决将各种包混杂在一起的问题。如果将一个包密封起来，就不能再向这个包添加类。

### 4.10 类设计技巧

1. 保证数据私有

2. 一定要对数据初始化

   ​	定义*POJO*类，不要设定任何的默认属性值。

3. 不要类中使用过多的基本类型

   ​	用其他的类来代替相关的基本类型

4. 不是所有的域都需要独立的域访问器和域更改器

5. 命名要有意义

6. 优先使用不可变类

## 第五章 继承

### 5.1.1 定义子类

​	**子类比超类拥有的功能更加丰富。** 在设计类的时候，应该将通用的方法放在超类中，而将具有特殊用途的方法放在子类中。

#### 5.1.2 覆盖方法

​	子类不能够直接地访问超类的私有域。使用*super*关键字可以调用超类的**方法**（公开属性也可以调用）。 ***super* 不是一个对象的引用，因此不能将*super*赋给另一个对象变量，它只是一个指示编译器调用超类方法的特殊关键字。**

#### 5.1.3 子类构造器

​	*super*可以实现对超类构造器的调用。**使用*super*调用构造器的语句必须是子类构造器的第一条语句。**

​	**如果子类构造器没有显示地调用超类的构造器，则将自动地调用超类默认构造器。如果超类没有不带参数的构造器，并且在子类的构造器中又没有显示地调用超类的其他构造器，则*Java*编译器将报告错误。**

​	**一个对象变量可以指示多种实际类型的现象被称为多态。** 在运行时能够自动地选择调用哪个方法的现象称为动态绑定。

#### 5.1.5 多态

​	**置换法则表明程序中出现超类对象的任何地方都可以用子类对象置换。**

```java
Employee e;
e = new Employee(...);
// OK
e = new Manage(...);
```

​	**不能将一个超类的引用赋值给子类变量**

```java
Employee staff = new Employee[3];
// error
Manager m = staff[i];
```

##### 警告

​	在*Java*中，子类数组的引用可以转换成超类数组的引用，而不需要采用强制类型转换。

```java
Manager managers = new Manager[10];
// OK
Employee staff = managers;
```

​	**要切记*manager*和*staff*引用的是同一个数组**

```java
staff[0] = new Employee(...);
```

​	在这里，***staff[0]*和*managers[0]*引用的是同一个对象**，我们把一个雇员擅自归入经理行列当中了！一旦对这两个引用进行操作，两个数组都会变换，但是由于*manager*是继承*employee*的，*manager*是不可以引用*employee*对象的，这里的操作将会扰乱相邻存储空间的内容**。为了确保不发生这类错误，所有数组都要牢记创建它们的元素类型，并负责监督仅将类型兼容的引用存储到数组中。如果试图存储*employee*对象就会引发*ArrayStoreException*异常。**

##### 5.1.6 理解方法调用

​	**在覆盖一个方法的时候，子类方法不能低于超类方法的可见性。** *private -> default -> protected -> public* 

#### 5.1.7 阻止继承：*final*类和方法

​	被*final*修饰的类将不允许被继承，类中的特定方法也可以被声明为*final*。如果这样做，子类将不可以覆盖（重写）这个方法。**被*final*修饰的类中的所有方法会自动地成为*final*，而不包括域。**

​	**将方法或类声明为final主要目的是：确保它们不会在子类中改变语义。**

1. *final*修饰变量，则等同于常量

2. *final*修饰方法中的参数，称为最终参数。

3. *final*修饰类，则类不能被继承

4. *final*修饰方法，则方法不能被重写。

5. *final* 不能修饰抽象类和接口

6. *final*修饰的方法可以被重载 但不能被重写

#### 5.1.8 强制类型转换

​	进行类型转换的唯一原因是：在暂时忽视对象的实际类型之后，使用对象的全部功能。

​	将一个子类的引用赋给一个超类变量，编译器是允许的。但将一个超类的引用赋给一个子类变量，必须进行类型转换，这样才能够通过运行时的检查。

​	类型转换应该：

- 只能在继承层次内进行类型转换

- 在将超类转换成子类之前，应该使用*instanceof*进行检查

  **如果需要用超类调用子类的扩展方法，应该检查一下超类的设计是否合理。在一般情况下，应该尽量少用类型转换和*instanceof*运算符。**

#### 5.1.9 抽象类

​	抽象类更加通用，人们只将它作为派生其他类的基类，而不作为想使用的特定的实例类。

​	**抽象类丛当着占位的角色，它们的具体实现在子类中。如果子类不实现抽象类中的所有抽象方法，则子类必须也是抽象类。**

​	抽象类有如下特点：

- **为了提供程序的清晰度，包含一个或多个抽象方法的类本身必须被声明为抽象的。**
- 除了抽象方法外，抽象类还可以包含具体数据和具体方法。
- 类即使不含抽象方法，也可以将类声明为抽象类
- **抽象类不能实例化**
- 可以定义一个抽象类的对象变量，但是它只能引用非抽象子类的对象

#### 5.1.10 受保护访问

​	任何声明为*private*的内容对其他类都是不可见的，子类也不能访问超类的私有域。

​	下面归纳一下Java用于控制可见性的*4*个访问修饰符：

1. 仅对本类可见 — *private*
2. 对所有类可见 — *public*
3. 对本包和所有子类可见 — *protected*
4. 对本包可见 — 默认，不需要修饰符

### 5.2 *Object*：所有类的超类

​	**在*Java*中，只有基本类型不是对象。所有的数组类型，不管是对象数组还是基本类型的数组都扩展了*Object*类。**

#### 5.2.3 *hashCode*方法

​	**如果重新定义*equals*方法，就必须重新定义*hashCode*方法，以便用户可以将对象插入到散列表中。**

#### 5.2.4 *toString*方法

​	数组继承了*Object*的*toString*方法，**如果想要将数组转为字符串类型，应该调用静态方法*Arrays.toString*。** 要想打印多维数组，则需要调用*Arrays.deepToString*方法。

#### 5.4 自动包装器与自动装箱

​	假设想定义一个整型数组列表，而**尖括号中的类型参数不允许是基本类型。** 由于每个值分别包装在对象中，所以*ArrayList<Interger>*的效率远远低于*int[]*数组。

​	**自动装箱规范要求*boolean*、*byet*、*char <= 127*， 介于 *-128 ~ 127* 之间的*short* 和 *int* 被包装到固定的对象中。也就是说在 *-127 ~ 128* 范围类的包装类型可以直接用 == 比较是否相等，其他时候应该使用*equals*比较。**

​	**装箱和拆箱是*编译器*认可的，而不是*虚拟机*。 **编译器在生成类的字节码时，插入必要的方法调用。虚拟机只是执行这些字节码。

### 5.7 反射

```java
e.getClass().newInstance();
```

​	*newInstance*可以用来**动态**创建一个类的实例。**它调用默认的构造器（没有参数的构造器）初始化新创建的对象。如果这个类没有默认构造器，就会抛出一个异常。**

​	**在程序运行期间，*Java*运行时系统始终为所有的对象维护一个被称为运行时的类型标识。这个信息跟踪着每个对象所属的类。虚拟机利用运行时类型信息选择相应的方法执行。**

#### 5.7.5 使用反射编写泛型数组代码

​	一个一开始就是*Object[ ]*的数组，永远不能转换为对象数组。

```java
private static Object goodCopyOf(Object a, int newLength) {
    Class cl = a.getClass();
    if (!cl.isArray()) {
        return null;
    }
    Class componentType = cl.getComponentType();
    int length = Array.getLength(a);
    Object newArray = Array.newInstance(componentType, newLength);
    System.arraycopy(a, 0, newArray, 0, Math.min(length, newLength));
    return newArray;
}
```

这个方法可以扩展任意类型的数组，而不仅是对象数组。

### 5.8 继承的设计技巧

1. 将公共操作和域放在超类

   ​	这里的公共指的是衍生类通用的域而不是*public*修饰符

2. 不要使用受保护的域（*protected*）

   ​	原因有二：一、任何一个类都可以继承一个超类并编写代码直接访问*protected*的实例域，从而破坏了封装性。二：在同一个包中的所有类都可以访问*protected*域，而不管它是否为这个类的子类。

3. 继承要有意义，不能滥用

4. 重写方法时不要改变方法预期的行为

## 第六章 接口、*lambda*表达式与内部类

#### 6.1.1 接口概念

​	接口中所有方法自动地属于*public*。因此，在接口中声明方法时，不必提供关键字*public*。

​	**在接口中可以定义常量，但是绝对不能含有实例域。在接口中的变量都是*public static final*修饰的，所以接口里面只能含有常量。**

#### 6.1.2 接口的特性

​	**接口可以被扩展，虽然在接口中不能包含实例域或静态方法，但却可以包含常量。尽管每个类只能有一个超类，但却可以实现多个接口。这就为定义类的行为提供了极大的灵活性。**

​	在*Java SE 8* 中，允许在接口中增加静态方法。

​	可以为接口提供一个默认实现，必须用*default*修饰符标记这样一个方法。

#### 6.1.6 解决默认方法冲突

​	在多个接口中有相同的默认方法(完全相同)，或者超类也有相同的方法时有如下规则：

1. 超类优先。如果超类提供了一个具体方法，同名而且有相同参数类型的默认方法会被忽略
2. 接口冲突。多个接口有完全相同的方法，实现类必须覆盖。

#### 6.22 *Comparator*接口

​	*Comparator* 和 *Comparable* 的区别：

​	*Arrays* 和 *Collections* 中的排序方法，当不指定*Comparator*时使用的就是默认排序方式，也就是使用*Comparable*。使用*Comparator* 就是使用提供的自定义比较器

- *sort(Object[])* 所有的对象都必须实现*Comparable*接口，它用来确定对象之间的大小关系 
- *sort(Object[], Comparator)* 对象不必实现*Comparable*接口，由*Comparator*来确定对象之间的大小关系

#### 6.2.3 对象克隆

```java
Employee original = new Employee("John Public", 50000);
Employee copy = original;
```

​	这里，原变量和副本都是同一个对象的引用，任何一个变量的改变都会影响另一个变量。

​	浅拷贝：使用*clone*方法可以使*copy*是一个新对象，它的初始状态与原变量相同，但是之后的状态会不同。但是原变量中的一些子对象还是会和*copy*后的对象共享，如果这些子对象是可变对象，那么原对象和克隆后的对象仍然会共享一些信息。

​	深拷贝：将原变量的所有可变子对象都建立克隆，这样就不会共享信息了。

​	**要使用*clone*必须实现*Cloneable*方法，并且重写*clone*方法，将*clone*方法改为*public*。如果是深拷贝就需要将所有的可变对象也进行*clone*。**

```java
   @Override
    public Employee clone() throws CloneNotSupportedException {
        Employee clone = (Employee) super.clone();
        clone.hireDay = (Date)hireDay.clone();
        return clone;
    }
```

#### 6.4.1  使用内部类访问对象状态

​	内部类既可以访问自身的数据域，也可以访问创建它的外围类对象的数据域。**内部类的对象总有一个隐式引用，它指向了创建它的外部类对象。这个引用在内部类中的定义是不可见的。外围类的引用在构造器中设置。编译器修改了所有的内部类的构造器，添加一个外围类引用参数。**

```java
/**
 这里TimerPrinter是内部类，TalkingClock是外围类
/
public TimePrinter(TalkingClock clock) {
    outer = clock;
}
```

#### 6.4.2 内部类的特殊语法规则

​	**非静态内部类中声明的所有静态域都必须是*final*。**我们希望一个静态域中只有一个实例，对于每个外部对象，会分别有一个单独的内部类实例。如果这个类不是*final*，它可能就不是唯一的。

​	**非静态内部类对于外部类有一个隐式的引用，所以非静态内部类不能有*static*方法。（编译时外部类会被编译成*this$0*）对于静态域来讲，所有的对象共享来自不同对象的静态对象这是违反直觉的。**

​	[*why-cant-we-have-static-method-in-a-non-static-inner-class*](https://stackoverflow.com/questions/975134/why-cant-we-have-static-method-in-a-non-static-inner-class)

#### 6.4.3 内部类是否有用、必要和安全

​	**内部类是一种编译现象，与虚拟机无关**

​	编译器为了引用外围类，生成了一个附加的实例域*this$0*（名字是编译器合成的，自己的代码中不能引用它）

> ​    *As with instance methods and variables, an inner class is associated with an instance of its enclosing class and has direct access to that object's methods and fields. Also, because an inner class is associated with an instance, it cannot define any static members itself.*

​	由于内部类拥有访问特权，所以与常规类比较起来功能更加强大

#### 6.4.4 局部内部类

​	**局部内部类不能用*public*或*private*访问说明符进行声明。它的作用域被限定在声明这个局部类的块中。**

​	局部类有一个优势，即对外部世界可以完全地隐藏起来。除了他所在的块中（方法），没有任何方法知道这个类的存在。

#### 6.4.6 匿名内部类

​	**由于构造器的名字必须与类名相同，而匿名类没有类名，所以，匿名类不能有构造器。取而代之的是，将构造器参数传递给*超类*构造器。尤其是在内部类实现接口的时候，不能有任何构造参数。**

​	双括号初始化：

```java
 /* 
  双括号初始化
 */
  invite(new ArrayList<String>() {
      {
          add("Harry");
          add("Mary");
      }
  });
```

这里的外层括号建立了*ArrayList*的一个匿名类，内层括号则是一个对象构造块。

#### 6.4.7 静态内部类

​	使用非静态内部类会有一个对外部类的引用，有时候并不需要内部类引用外围类的对象。为此，可以将内部类声明为*static*，以便取消产生的引用。

​	**只有内部类可以声明为*static***。静态内部类的对象除了没有对生成它的外围类对象的引用特权外，与其他所有内部类完全一样。在内部类不需要访问外围类对象的时候，就应该使用静态内部类。

​	**与常规内部类不同，静态内部类可以有静态域和方法。**

​	**声明在接口中的内部类自动成为*static*和*public*类。**

#### 6.5 代理

​	使用代理可以在**运行时**创建一个实现了一组给定**接口**的新类。

​	无论何时调用代理对象的方法，调用处理器的*invoke*方法都会被调用，并向其传递*Method*对象和原始的参数。

​	**所有的代理类都继承自*Proxy*类，一个代理类只有一个实例域—调用处理器。**

​	所有的代理类都覆盖了*Object*类中的*toString*、*equals*和*hashCode*。这些方法仅仅调用了调用处理器的*invoke*。

​	代理类一定是*public*和*final*。

​	动态代理其实就是代理对象调用目标对象的同名方法，并在调用前后增强代码。

- 为什么 *JDK* 动态代理要**基于接口实现**？而不是基于继承来实现？

  ​	因为 *JDK* 动态代理生成的对象默认是继承 *Proxy* ，*Java* 不支持多继承，所以 *JDK* 动态代理要基于接口来实现。

- *JDK* 动态代理中，**目标对象调用自己的另一个方法，会经过代理对象么**？

  ​	内部调用方法使用的对象是目标对象本身，被调用的方法不会经过代理对象。

  以下是代理对象的*class*文件

```java
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.sun.proxy;

import core.java.chapter6.interview.IBuyService;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.UndeclaredThrowableException;

public final class $Proxy0 extends Proxy implements IBuyService {
    private static Method m1;
    private static Method m3;
    private static Method m2;
    private static Method m4;
    private static Method m0;

    public $Proxy0(InvocationHandler var1) throws  {
        super(var1);
    }

    public final boolean equals(Object var1) throws  {
        try {
            return (Boolean)super.h.invoke(this, m1, new Object[]{var1});
        } catch (RuntimeException | Error var3) {
            throw var3;
        } catch (Throwable var4) {
            throw new UndeclaredThrowableException(var4);
        }
    }

    public final void buyItem(int var1) throws  {
        try {
            super.h.invoke(this, m3, new Object[]{var1});
        } catch (RuntimeException | Error var3) {
            throw var3;
        } catch (Throwable var4) {
            throw new UndeclaredThrowableException(var4);
        }
    }

    public final String toString() throws  {
        try {
            return (String)super.h.invoke(this, m2, (Object[])null);
        } catch (RuntimeException | Error var2) {
            throw var2;
        } catch (Throwable var3) {
            throw new UndeclaredThrowableException(var3);
        }
    }

    public final void refund(int var1) throws  {
        try {
            super.h.invoke(this, m4, new Object[]{var1});
        } catch (RuntimeException | Error var3) {
            throw var3;
        } catch (Throwable var4) {
            throw new UndeclaredThrowableException(var4);
        }
    }

    public final int hashCode() throws  {
        try {
            return (Integer)super.h.invoke(this, m0, (Object[])null);
        } catch (RuntimeException | Error var2) {
            throw var2;
        } catch (Throwable var3) {
            throw new UndeclaredThrowableException(var3);
        }
    }

    static {
        try {
            m1 = Class.forName("java.lang.Object").getMethod("equals", Class.forName("java.lang.Object"));
            m3 = Class.forName("core.java.chapter6.interview.IBuyService").getMethod("buyItem", Integer.TYPE);
            m2 = Class.forName("java.lang.Object").getMethod("toString");
            m4 = Class.forName("core.java.chapter6.interview.IBuyService").getMethod("refund", Integer.TYPE);
            m0 = Class.forName("java.lang.Object").getMethod("hashCode");
        } catch (NoSuchMethodException var2) {
            throw new NoSuchMethodError(var2.getMessage());
        } catch (ClassNotFoundException var3) {
            throw new NoClassDefFoundError(var3.getMessage());
        }
    }
}
```

## 第七章 异常、断言和日志

### 7.1 处理错误

​	**需要注意的是抛出*(throw)*异常后，这个方法将会立刻退出，并不会返回任何值。此时，调用这个方法的代码也将无法继续执行，取而代之的是，异常处理机制开始搜索能够处理这种异常状况的异常处理器。在*Java*中，只能抛出*Throwable*子类的异常。**

#### 7.1.1 异常分类

​	异常对象都是派生于*Throwable*类的一个实例（继承自*Throwable*）。

![7-1](assets/up-345b8c9ca5941c917d742a61b366f11470f.png)

**如果出现*RuntimeException*异常，那么就一定是你的问题。**

​	*Java*语言规范将派生于*Error*类或*RuntimeException*类的所有异常称为**非受查异常**，所有其他的异常称为**受查异常**。编译器将检查是否为所有的受查异常提供了异常处理器。

#### 7.1.2 声明受查异常

​	不需要声明*Java*的内部错误，即从*Error*继承的错误。同样，也不应该声明从*RuntimeException*继承的那些非受查异常。

#### 7.2.4 *finally*子句

​	当代码抛出一个异常时，就会终止方法中剩余代码的处理，并退出这个方法的执行。当发生异常时，恰当地关闭所有资源是非常重要的。

​	不管是否有异常被捕获，*finally*子句中的代码都被执行。

​	解耦合*try/catch*和*try/finally*语句块，这样可以提高代码的清晰度。

```java
InputStream in = ...;
 /*
   外层try语句块：确保报告出现的错误
  */
try {
    /*
    内层try语句块：确保关闭输入流
    */
    try{
        // code that might throw exceptions
    } finally {
        in.close();
    }
} catch(IOException e) {
    // show error message
}
```

​	如果*finally*语句块中也有*return*语句，这个返回值将会覆盖原始的返回值。

​	执行*finally*语句块，并调用*close*方法。而*close*方法本身也有可能抛出*IOException*异常。当出现这种情况时，原始的异常将会丢失，转而抛出*close*方法的异常。这样会有问题，因为第一个异常很有可能更有意思（我们想看到的）。如果想要做适当的处理，重新抛出原来的异常，代码会变得极其繁琐。

```java
InputStream in = ...;
Exception ex = null;
try
{
    try
    {
        // code that might throw exceptions
    }
    catch(Exception e)
    {
        ex = e;
        throw e;
    }
}
finally
{
    try
    {
        in.close();
    }
    catch (Exception e)
    {
        if(ex == null) throw e;
    }
}
```

#### 7.2.5 带资源的*try*语句

​	假设资源属于一个实现了*AutoCloseable*接口的类，那么就可以使用带资源的*try*语句。（还有一个*Closeable*接口，这是*AutoCloseable*的子接口，也包含一个*close*方法，这个方法声明为抛出一个*IOException*）

```java
try(Resource rs) {
    work with res
}
```

​	**这个块正常退出或者发生异常时，会自动调用*res.close()*方法，就好像是用了*finally*块一样。**还可以同时指定多个资源

```java
try(Scanner in = new Scanner(new FileInputStream("/usr/share/dict/words"), "UTF-8");
   PrintWriter out = new PrintWriter("out.txt")) {
    while(in.hasNext()) {
        out.println(in.next().toUpperCase());
    }
}
```

​	无论何时*in*和*out*都会关闭。如果使用常规的方式，就需要两个嵌套的*try/finally*语句。

​	带资源的try语句也可以有*catch*子句和*finally*子句。这些子句将会在资源关闭后执行，在实际中，一个*try*语句中加入这么多内容不是个好主意。

## 第八章 泛型程序设计

​	使用泛型机制编写的程序代码要比那些杂乱地使用*Object*变量，然后再进行强制类型转换的代码具有更好的**安全性和可读性**。**对于*Object*，可以放入任意类的对象，导致使用时出错。**而泛型参数用来指示了元素的类型。

​	在*Java*库中，使用变量*E*表示集合的元素类型，*K*和*V*分别表示表的关键字与值的类型。*T*表示任意类型。
​	**用具体的类型替代类型变量就可以实例化泛型类型，换句话说，泛型可以看做普通类的工厂。**（类型变量用尖括号*<>*括起来）

​	对比非泛型代码，使用泛型有诸多好处：

- 编译器强类型检查，把错误提前到编译器，因为运行期报错比较难找
- 避免手动强制转换
- 方便实现通用模板，且更安全、可读性更高

### 8.3 泛型方法

​	泛型方法可以定义在普通类中，也可以定义在泛型类中。

### 8.4 类型变量的限定

​	可以通过对类型变量*T*设置限定：

```java
public static <T extends Comparable> T min(T[] a) {
    
}
```

现在*min*方法只能被实现了*Comparable*接口的类调用，没有实现的调用将会产生编译时错误。

​	为什么使用*extends*而不是*implents*？这里表示的是T是绑定类型的子类型。*T*和绑定类型可以是类也可以是接口。选择关键字*extends*的原因是更接近子类的概念。

​	如果有多个限定使用&做分隔。

```java
T extends Comparable & Serializable
```

### 8.5 泛型代码和虚拟机

​	**虚拟机没有泛型类型对象—所有对象都属于普通类**

#### 8.5.1 类型擦除

​	无论何时定义一个泛型类型，都自动提供了一个相应的原始类型。**在泛型类被类型擦除的时候，如果没有限定类型变量，则会被替换为*Object*。如果指定了类型变量，则替换为第一个限定的类型变量。**

```java
public class Interval<T extends Comparable & Serializable> implements Serializable {
   private T lower; 
}
```

替换后的原始类型为：

```java
public class Interval implements Serializable {
    private Comparable lower;
}
```

​	当然可以切换限定类型的位置，为了提高效率，应该将没有方法的接口（标签接口）放在后面。

#### 8.5.3 翻译泛型方法

- *Java*虚拟机中没有泛型，只有普通的方法和类
- 所有的类型参数都用它们的限定类型替换
- 桥方法被合成来保持多态
- 为保持类型安全性，必要时插入强制类型转换

### 8.6 约束与局限性

1. 不能用基本类型实例化类型参数

   ​	类型擦除后，类中含有*Object*的类型的域，而*Object*不能存储基本类型的值。

2. 运行时类型查询只适用于原始类型

   ​	*getClass*方法总是返回原始类型

3. 不能实例化参数类型的数组

   ​	如果需要收集参数化类型对象，只有一种安全而有效地方法：使用*ArrayList：ArrayList<Pair\<String\>>*

4. 不能实例化类型变量

5. 不能构造泛型数组

6. 泛型类的静态上下文中类型变量无效

   ​	不能再静态域或方法中引用类型变量

7. 不能抛出或捕获泛型类的实例

   ​	既不能抛出也不能捕获泛型类对象。甚至泛型类继承*Throwable*都是不合法的。*catch*子句中不能使用类型变量。

   不过可以在限定类型时是合理的：

```java
public <T extends Throwable> void test(T t) throws T {
    try {

    } catch (Throwable tt) {
     	 t.initCause(tt);
         throw t;
    }
}
```

### 8.7 泛型类型的继承规则

​	无论*S*与*T*有什么联系，通常，*Pair\<S\>*与*Pair\<T\>*没有什么联系。

​	泛型类可以继承或实现其他的泛型类。这意味着一个*ArrayList\<Manage\>*可以被转换为一个*List\<Manager\>*![8-2](assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3l6cGJyaWdodA==,size_16,color_FFFFFF,t_70.png)

### 8.8 通配符类型

#### 8.8.3 无限定通配符

​	泛型通配符*?* 代表任意泛型，那么这个容器什么泛型都有可能。所以只能以*Object*的形式取出来，并且不能存入对象， 因为不知道具体是什么泛型的容器。

#### 上边界通配符 *extends*

​	***extends*小结**

- *List<? extends Human>*指向：只能指向子类型*List*，比如*List\<Chinese\>*，*Human*是最上边的类
- *List<? extends Human>*取出：接上一条限制，不论指向什么*List*元素必然是*Human*及其子类型，按*Human*转
- *List<? extends Human>*存入：禁止存入

#### 下边界通配符 *super*

​	***super*小结**

- *List<? super Human>*接收：只能指向父类型*List*，比如*List\<Creature\>、List\<Primate\>*
- *List<? super Human>*取出：只能转*Object*
- *List<? super Human>*存入：只能存*Human*及其子类型元素

#### 无界通配符

- 存：禁止存入

- 取：只能是*Object*

#### *PECS(Producer Extends Consumer Super)*

- 频繁往外读取内容的，适合用*<? extends T>：extends*返回值稍微精确些
- 经常往里插入的，适合用*<? super T>：super*允许存入子类型元素