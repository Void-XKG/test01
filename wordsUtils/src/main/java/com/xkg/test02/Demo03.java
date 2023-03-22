package com.xkg.test02;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

public class Demo03 {
    public static void main(String[] args) {
        String s = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\">\n" +
                "    <meta name=\"renderer\" content=\"webkit\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no\">\n" +
                "    <meta http-equiv=\"Cache-Control\" content=\"no-transform\">\n" +
                "    <meta http-equiv=\"Cache-Control\" content=\"no-siteapp\">\n" +
                "    \n" +
                "    <meta name=\"keywords\" content=\"词根词缀,英语词根表,词根词缀大全,词根字典,英语词根,同根词\">\n" +
                "    <meta name=\"description\" content=\"趣词英语词根表是一个在线英语词根字典，是目前网上最全的英语词根词缀词典，收录了众多的英语词根词缀信息，可以帮助大家通过词根词缀记忆法来高效、快速地记忆英语单词。\">\n" +
                "\n" +
                "    <title>英语词根字典 - 词根词缀大全 - 趣词英语词根表</title>\n" +
                "\n" +
                "    <link rel=\"stylesheet\" href=\"/root/root.css?20151209\">\n" +
                "    </head>\n" +
                "<body>\n" +
                "<div id=\"my-nav-box\" style=\"height: 40px;background-color: #545652;margin-bottom: 20px;\">\n" +
                "    <a href=\"/\" target=\"_blank\" style=\"padding: 0 10px;font-size: 17px;line-height: 40px;color: #ccc;font-weight: normal;\">趣词首页</a>\n" +
                "    <a href=\"/gzh.php\" target=\"_blank\" style=\"padding: 0 10px;font-size: 17px;line-height: 40px;color: #ccc;font-weight: normal;\">公众号</a>\n" +
                "    <a href=\"https://mp.weixin.qq.com/s/23s76zCQUpRiaRaY8XnYFg\" target=\"_blank\" style=\"padding: 0 10px;font-size: 17px;line-height: 40px;color: #ccc;font-weight: normal;\">小程序</a>\n" +
                "</div>\n" +
                "\n" +
                "<div id=\"container\">\n" +
                "    <div id=\"navigation\">\n" +
                "        <div id=\"logo\">\n" +
                "            <div class=\"logo-top\"><span>quword</span> 趣词</div>\n" +
                "            <div class=\"logo-down\">Word Roots Dictionary</div>\n" +
                "        </div>\n" +
                "        <form method=\"get\" action=\"/root/search\" id=\"yd-search\">\n" +
                "            <input type=\"text\" name=\"wd\" id=\"wd\" autocomplete=\"off\" onmouseover=\"this.select();\" onfocus=\"this.select();\" value=\"\" maxlength=\"50\">\n" +
                "            <input type=\"submit\" value=\"Search\" class=\"btn\">\n" +
                "        </form>\n" +
                "        <div id=\"browse\">\n" +
                "            <ul>\n" +
                "                <li><a href=\"/root/list/a\">A</a></li>\n" +
                "                <li><a href=\"/root/list/b\">B</a></li>\n" +
                "                <li><a href=\"/root/list/c\">C</a></li>\n" +
                "                <li><a href=\"/root/list/d\">D</a></li>\n" +
                "                <li><a href=\"/root/list/e\">E</a></li>\n" +
                "                <li><a href=\"/root/list/f\">F</a></li>\n" +
                "                <li><a href=\"/root/list/g\">G</a></li>\n" +
                "                <li><a href=\"/root/list/h\">H</a></li>\n" +
                "                <li><a href=\"/root/list/i\">I</a></li>\n" +
                "                <li><a href=\"/root/list/j\">J</a></li>\n" +
                "                <li><a href=\"/root/list/k\">K</a></li>\n" +
                "                <li><a href=\"/root/list/l\">L</a></li>\n" +
                "                <li><a href=\"/root/list/m\">M</a></li>\n" +
                "                <li><a href=\"/root/list/n\">N</a></li>\n" +
                "                <li><a href=\"/root/list/o\">O</a></li>\n" +
                "                <li><a href=\"/root/list/p\">P</a></li>\n" +
                "                <li><a href=\"/root/list/q\">Q</a></li>\n" +
                "                <li><a href=\"/root/list/r\">R</a></li>\n" +
                "                <li><a href=\"/root/list/s\">S</a></li>\n" +
                "                <li><a href=\"/root/list/t\">T</a></li>\n" +
                "                <li><a href=\"/root/list/u\">U</a></li>\n" +
                "                <li><a href=\"/root/list/v\">V</a></li>\n" +
                "                <li><a href=\"/root/list/w\">W</a></li>\n" +
                "                <li><a href=\"/root/list/x\">X</a></li>\n" +
                "                <li><a href=\"/root/list/y\">Y</a></li>\n" +
                "                <li><a href=\"/root/list/z\">Z</a></li>\n" +
                "            </ul>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "\n" +
                "    <div id=\"article\" class=\"content\">\n" +
                "        <div class=\"paging\"><ul><li><a href=\"/root/page/z/0\">1</a> </li><li><a class=\"current\" href=\"/root/page/z/1\">2</a> </li></ul></div><h2>词根词缀：<a href=\"/root/id/5402\">zoo-, zoa-, zo-, -zoic, -zoid, -zoite, -zoal, -zonal, -zooid, -zoon, -zoa, -zoan</a></h2><p>【来源及含义】Greek: animal, animals; living beings; life</p><p>【相关词根词缀】Related <b>\"animal\"</b> units: &#13;\n" +
                "<a href=\"/root/search?wd=anima-\" target=\"_blank\"><b>anima-</b></a>;&#13;\n" +
                "<a href=\"/root/search?wd=faun-\" target=\"_blank\"><b>faun-</b></a>;&#13;\n" +
                "<a href=\"/root/search?wd=therio-\" target=\"_blank\"><b>therio-</b></a>.&#13;</p><p>【同源单词】<a class=\"cognate\" target=\"_blank\" href=\"/w/acanthozooid\">acanthozooid</a>, <a class=\"cognate\" target=\"_blank\" href=\"/w/Actinozoa\">Actinozoa</a>, <a class=\"cognate\" target=\"_blank\" href=\"/w/actinozoa\">actinozoa</a>, <a class=\"cognate\" target=\"_blank\" href=\"/w/actinozoal\">actinozoal</a>, <a class=\"cognate\" target=\"_blank\" href=\"/w/actinozoan\">actinozoan</a>, <a class=\"cognate\" target=\"_blank\" href=\"/w/agrizoology\">agrizoology</a></p><h2>词根词缀：<a href=\"/root/id/5403\">zoster-, zoster</a></h2><p>【来源及含义】Greek: girdle; belt</p><p>【同源单词】<a class=\"cognate\" target=\"_blank\" href=\"/w/diazoster\">diazoster</a>, <a class=\"cognate\" target=\"_blank\" href=\"/w/herpes_zoster_ophthalmicus\">herpes zoster ophthalmicus</a>, <a class=\"cognate\" target=\"_blank\" href=\"/w/herpes_zoster\">herpes zoster</a>, <a class=\"cognate\" target=\"_blank\" href=\"/w/zoster\">zoster</a>, <a class=\"cognate\" target=\"_blank\" href=\"/w/zoster_auricularis\">zoster auricularis</a>, <a class=\"cognate\" target=\"_blank\" href=\"/w/zoster_brachilis\">zoster brachilis</a></p><h2>词根词缀：<a href=\"/root/id/5404\">zygo-, zyg-, -zygous; zygomatico-</a></h2><p>【来源及含义】Greek: yoke, forming pairs; joined, union; or indicating a relationship to a junction; meaning a yoke or crossbar by which two draft animals; such as, oxen could be hitched to a plow or wagon</p><p>【同源单词】<a class=\"cognate\" target=\"_blank\" href=\"/w/accessory_hemiazygos_vein\">accessory hemiazygos vein</a>, <a class=\"cognate\" target=\"_blank\" href=\"/w/autozygous\">autozygous</a>, <a class=\"cognate\" target=\"_blank\" href=\"/w/azygoesophageal_recess\">azygoesophageal recess</a>, <a class=\"cognate\" target=\"_blank\" href=\"/w/azygoesophageal\">azygoesophageal</a>, <a class=\"cognate\" target=\"_blank\" href=\"/w/azygogram\">azygogram</a>, <a class=\"cognate\" target=\"_blank\" href=\"/w/azygography\">azygography</a></p><h2>词根词缀：<a href=\"/root/id/5405\">zygoma-</a></h2><p>【来源及含义】Greek: bolt or bar</p><p>【同源单词】<a class=\"cognate\" target=\"_blank\" href=\"/w/zygoma\">zygoma</a>, <a class=\"cognate\" target=\"_blank\" href=\"/w/zygomancy\">zygomancy</a>, <a class=\"cognate\" target=\"_blank\" href=\"/w/zygomatic\">zygomatic</a>, <a class=\"cognate\" target=\"_blank\" href=\"/w/zygomaticofacial\">zygomaticofacial</a>, <a class=\"cognate\" target=\"_blank\" href=\"/w/zygomaticofrontal\">zygomaticofrontal</a>, <a class=\"cognate\" target=\"_blank\" href=\"/w/zygomaticomaxillary\">zygomaticomaxillary</a></p><h2>词根词缀：<a href=\"/root/id/5406\">zygomatico-</a></h2><p>【来源及含义】Greek: the malar bone or the arch that the malar bone forms with the other bones to which it is connected</p><p>【相关描述】So named because it \"yokes\" the bones of the face together with those of the skull.</p><p>【同源单词】<a class=\"cognate\" target=\"_blank\" href=\"/w/zygomaticofacial\">zygomaticofacial</a>, <a class=\"cognate\" target=\"_blank\" href=\"/w/zygomaticofrontal\">zygomaticofrontal</a>, <a class=\"cognate\" target=\"_blank\" href=\"/w/zygomaticomaxillary\">zygomaticomaxillary</a>, <a class=\"cognate\" target=\"_blank\" href=\"/w/zygomatico-orbital\">zygomatico-orbital</a>, <a class=\"cognate\" target=\"_blank\" href=\"/w/zygomaticosphenoid\">zygomaticosphenoid</a>, <a class=\"cognate\" target=\"_blank\" href=\"/w/zygomaticotemporal\">zygomaticotemporal</a></p><h2>词根词缀：<a href=\"/root/id/5407\">zymo-, zym-, -zyme, -zymic</a></h2><p>【来源及含义】Greek: ferment, fermentation; leaven [leavening agent, leavening catalyst]</p><p>【同源单词】<a class=\"cognate\" target=\"_blank\" href=\"/w/azyme\">azyme</a>, <a class=\"cognate\" target=\"_blank\" href=\"/w/azymic\">azymic</a>, <a class=\"cognate\" target=\"_blank\" href=\"/w/cytozyme\">cytozyme</a>, <a class=\"cognate\" target=\"_blank\" href=\"/w/enzymatic\">enzymatic</a>, <a class=\"cognate\" target=\"_blank\" href=\"/w/enzyme\">enzyme</a>, <a class=\"cognate\" target=\"_blank\" href=\"/w/enzymology\">enzymology</a></p><div class=\"paging\"><ul><li><a href=\"/root/page/z/0\">1</a> </li><li><a class=\"current\" href=\"/root/page/z/1\">2</a> </li></ul></div>    </div>\n" +
                "</div>\n" +
                "<script>\n" +
                "    document.getElementById('yd-search').onsubmit = function() {\n" +
                "        var word = this.wd.value.replace(/\\u3000/g, ' ').replace(/(^\\s+|\\s+$)/g, '');\n" +
                "        if (word == '') {\n" +
                "            return false;\n" +
                "        } else {\n" +
                "            this.wd.value = word.replace(/[\\uff01-\\uffe1]/g, function(match) {\n" +
                "                var char_code = match.charCodeAt(0) - 0xfee0;\n" +
                "                return String.fromCharCode(char_code);\n" +
                "            });\n" +
                "        }\n" +
                "    }\n" +
                "    document.getElementById('wd').focus();\n" +
                "</script>\n" +
                "<script src=\"/lib/jquery/jquery-2.1.4.min.js\"></script>\n" +
                "<script src=\"/ciyuan/prompt.js\"></script>\n" +
                "<div style=\"display: none;\">\n" +
                "<!-- <script src=\"/js/sweetalert2.all.min.js?v1.3\"></script> -->\n" +
                "<script type=\"text/javascript\">\n" +
                "(function() {\n" +
                "// if (window.navigator.userAgent.indexOf('MicroMessenger') === -1) {\n" +
                "//     if (window.localStorage.getItem('has_showed') != 'yes') {\n" +
                "//         window.localStorage.setItem('has_showed', 'yes');\n" +
                "//         var clsValue = '';\n" +
                "//         if (document.querySelector('.navbar-collapse')) {\n" +
                "//             clsValue = 'btn btn-success btn-lg';\n" +
                "//         }\n" +
                "//         Swal.fire({\n" +
                "//             title: '单词天天刷',\n" +
                "//             icon: 'info',\n" +
                "//             html:\n" +
                "//             '趣斗单词小程序上新啦！新增了<strong><span style=\"color: rgb(255, 104, 39);\">单词天天刷</span></strong>的功能，可以像刷抖音一样刷单词，感兴趣的小伙伴儿们，赶快去了解一下吧！' +\n" +
                "//             '<br><br><a class=\"' + clsValue + '\" role=\"button\" target=\"_blank\" href=\"https://mp.weixin.qq.com/s/UJ-yf634s7jVT8VcV56ReQ\">点击查看详细介绍</a>',\n" +
                "//             showCloseButton: true,\n" +
                "//             showConfirmButton: false,\n" +
                "//             cancelButtonText: '<i class=\"fa fa-thumbs-down\"></i>'\n" +
                "//         });\n" +
                "//     }\n" +
                "// }\n" +
                "\n" +
                "if (window.top.document.getElementById('web-box')) {\n" +
                "    var _ref_ = '';\n" +
                "    var styles = document.styleSheets;\n" +
                "\n" +
                "    $('a').click(function () {\n" +
                "        this.target = '_self';\n" +
                "    });\n" +
                "\n" +
                "    for (var ss = 0; ss < styles.length; ss++) {\n" +
                "        _ref_ += styles[ss].href;\n" +
                "    }\n" +
                "\n" +
                "    if (_ref_.indexOf('wechat.css') === -1) {\n" +
                "        var fileref = document.createElement(\"link\");\n" +
                "\n" +
                "        fileref.setAttribute(\"rel\", \"stylesheet\");\n" +
                "        fileref.setAttribute(\"type\", \"text/css\");\n" +
                "        fileref.setAttribute(\"href\", \"/css/wechat.css\");\n" +
                "\n" +
                "        document.getElementsByTagName(\"head\")[0].appendChild(fileref);\n" +
                "    }\n" +
                "}\n" +
                "})();\n" +
                "</script>\n" +
                "<script charset=\"UTF-8\" id=\"LA_COLLECT\" src=\"//sdk.51.la/js-sdk-pro.min.js\"></script>\n" +
                "<script>LA.init({id: \"Jegfw0kpN86OAXwD\",ck: \"Jegfw0kpN86OAXwD\"})</script>\n" +
                "<script type=\"text/javascript\" src=\"https://s9.cnzz.com/z_stat.php?id=1278225540&web_id=1278225540\"></script>\n" +
                "<script>\n" +
                "var _hmt = _hmt || [];\n" +
                "(function() {\n" +
                "  var hm = document.createElement(\"script\");\n" +
                "  hm.src = \"https://hm.baidu.com/hm.js?b98d5a4c985b16117a3eb5bd26322264\";\n" +
                "  var s = document.getElementsByTagName(\"script\")[0]; \n" +
                "  s.parentNode.insertBefore(hm, s);\n" +
                "})();\n" +
                "</script>\n" +
                "<script>\n" +
                "(function(){\n" +
                "    var bp = document.createElement('script');\n" +
                "    var curProtocol = window.location.protocol.split(':')[0];\n" +
                "    if (curProtocol === 'https') {\n" +
                "        bp.src = 'https://zz.bdstatic.com/linksubmit/push.js';\n" +
                "    } else {\n" +
                "        bp.src = 'http://push.zhanzhang.baidu.com/push.js';\n" +
                "    }\n" +
                "    var s = document.getElementsByTagName(\"script\")[0];\n" +
                "    s.parentNode.insertBefore(bp, s);\n" +
                "})();\n" +
                "</script>\n" +
                "</div>\n" +
                "\n" +
                "</body>\n" +
                "</html>";
        List<Root> roots = new ArrayList<>();
        Document document = Jsoup.parse(s, "utf-8");
        Element article = document.getElementById("article");

        Elements wordAndMeanNodes = article.children();
        Elements allElements = article.getElementsByTag("h2");
        for (int i = 0; i < allElements.size(); i++) {
            Element element = allElements.get(i);
            Elements children1 = element.children();
            String rootValue = children1.get(0).ownText();
            String style = element.ownText();
            List<String> originsMeans = new ArrayList<>();

            int index = wordAndMeanNodes.indexOf(element);
            for (int j = 0; j < wordAndMeanNodes.size(); j++) {
                Element element2 = wordAndMeanNodes.get(index + 1);

                String name = element2.tag().getName();

                if (!"p".equals(name)) {
                    break;
                }
                String text = element2.text();
                originsMeans.add(text);
                index++;
            }
            Root origin = new Root(style,rootValue,originsMeans);
            roots.add(origin);
        }
        int i = 0;
    }


}


class Root {
    String style;
    String rootValue;
    List<String> originMeans;

    public Root(String nameValue, String rootValue, List<String> originMeans) {
        this.style = nameValue;
        this.rootValue = rootValue;
        this.originMeans = originMeans;
    }

    @Override
    public String toString() {
        return "Root{" +
                "nameValue='" + style + '\'' +
                ", rootValue='" + rootValue + '\'' +
                ", originMeans=" + originMeans +
                '}';
    }
}


