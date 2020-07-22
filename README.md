# CoreJava
Java 核心技术卷一 (第十版)

## 第三章

### 3.3 数据类型

#### 3.3.3 *char*类型

​	*\u*是一个转义序列，可以出现在**加引号的字符字面量或字符串**中。*\u*后面跟着四个*16*进制数来表示一个*Unicode*字符。

#### 3.5.2 数值类型之间的转换

​	两个不同类型的数值进行二元操作时，先要将两个操作数转换为同一种类型，然后再进行计算。

- 有*double*转成*double*
- 否则，有*float*转成*float*
- 否则，有*long*转为*long*
- **否则两个操作数都会被转为*int***

#### 3.5.3 强制类型转换

​	强制类型转换可能会导致信息丢失。只有极少数的情况下才需要将布尔类型转换为数值类型，这时可以使用条件表达式 *b ? 1 : 0*。

#### 3.5.4 结合赋值和运算符

​	可以在赋值中使用二元运算符，如： *x += 4;* 等价于 *x = x + 4;* **如果运算符得到的一个值，其类型与左侧操作数的类型不同，就会发生强制类型转换。**		

