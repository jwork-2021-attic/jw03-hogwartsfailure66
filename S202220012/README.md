[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-f059dc9a6f8d3a56e377f745f24479a46679e63a5d9fe6f495e02850cd0d8118.svg)](https://classroom.github.com/online_ide?assignment_repo_id=5778831&assignment_repo_type=AssignmentRepo)
# W03

1. 写下对代码工作原理的理解；

   通过`SteganographyFactory`类将`.java`文件编译生成`.class`文件，读取图片后调用`steganographyEncoder`类的`encodeFile`方法进行编码，最后输出新图片。

   `SteganographyClassLoader`类中重写了`findClass`方法，通过`decodeByteArray`方法得到编码进去的排序类的字节码，`loadClass`到一个新的类c，最后通过`newInstance`方法创建一个实例进行排序。

2. 将自己在`W02`中实现的两个排序算法（冒泡排序除外）分别编码进自选图片得到隐写术图，在markdown中给出两个图片的URL；

   QuickSort:  

   ![image](https://github.com/jwork-2021/jw03-hogwartsfailure66/blob/main/S202220012.QuickSorter.png)  

   SelectSort:  

   ![image](https://github.com/jwork-2021/jw03-hogwartsfailure66/blob/main/S202220012.SelectSorter.png)  

3. 用你的图片给`W02`中example的老头赋予排序能力，得到排序结果（动画），上传动画到asciinema，在markdown中给出两个动画的链接。

   https://www.bilibili.com/video/BV1Ar4y127uU/  

4. 联系另一位同学，用他的图片给`W02`中example的老头赋予排序能力，在markdown中记录你用的谁的图片，得到结果是否正确。

   使用了刘睿哲同学（202220008）的图片，结果正确

