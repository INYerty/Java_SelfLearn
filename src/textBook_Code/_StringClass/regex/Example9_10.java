package textBook_Code._StringClass.regex;

public class Example9_10 {
    public static void main(String[] args) {
        String str = "欢迎大家访问http://www.xiaojiang.cn了解、参观公司";
        //这里有一个网址 http://www.xiaojiang.cn 混在文字里。
        String regex = "(http://|www)\56?\\w+\56{1}\\w+\56{1}\\p{Alpha}+";
        //第 7 行定义了一个用于匹配网址的正则表达式。具体含义如下：
        //
        //- `(http://|www)`：匹配以 `http://` 或 `www` 开头的字符串。
        //- `\56?`：`\56` 是八进制表示的点号 `.`，`?` 表示前面的点号可有可无。
        //- `\\w+`：匹配一个或多个字母、数字或下划线。
        //- `\56{1}`：再次匹配一个点号。
        //- `\\w+`：匹配一个或多个字母、数字或下划线。
        //- `\56{1}`：再匹配一个点号。
        //- `\\p{Alpha}+`：匹配一个或多个字母（域名后缀）。
        //
        //这个正则用于识别类似 `http://www.xiaojiang.cn` 这样的网址，并在后续代码中将其替换为 `*网址被屏蔽*`。
        System.out.printf("剔除\n\"%s\"\n中的网站链接信息后得到的字符串：\n",str);
        //替换掉网址
        str = str.replaceAll(regex,"*网址被屏蔽*");
        System.out.println(str);
    }
}
