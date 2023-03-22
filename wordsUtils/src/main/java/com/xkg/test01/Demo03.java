package com.xkg.test01;

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
                "\n" +
                "    <meta name=\"keywords\" content=\"词源字典,词源词典,英语词源,单词词源,同根词,同源词\">\n" +
                "    <meta name=\"description\" content=\"趣词词源是一个在线词源网站，是网上最全的英语词源字典，收录了众多的单词词源信息，是一个不可多得的在线词源词典，可以帮助大家高效、快速、科学地理解与记忆英语单词。这是词源字典的中文版。\">\n" +
                "\n" +
                "    <title>英语词源字典 - 趣词词源词典</title>\n" +
                "    \n" +
                "    <link rel=\"stylesheet\" href=\"/ciyuan/ciyuan.css?20151229\">\n" +
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
                "            <div class=\"logo-down\">Word Origins Dictionary</div>\n" +
                "        </div>\n" +
                "        <form method=\"get\" action=\"/ciyuan/s\" id=\"yd-search\">\n" +
                "            <input type=\"text\" name=\"wd\" id=\"wd\" autocomplete=\"off\" onmouseover=\"this.select();\" onfocus=\"this.select();\" value=\"\" maxlength=\"50\">\n" +
                "            <input type=\"submit\" value=\"Search\" class=\"btn\">\n" +
                "        </form>\n" +
                "        <div id=\"browse\">\n" +
                "            <ul>\n" +
                "                <li><a href=\"/ciyuan/list/a\">A</a></li>\n" +
                "                <li><a href=\"/ciyuan/list/b\">B</a></li>\n" +
                "                <li><a href=\"/ciyuan/list/c\">C</a></li>\n" +
                "                <li><a href=\"/ciyuan/list/d\">D</a></li>\n" +
                "                <li><a href=\"/ciyuan/list/e\">E</a></li>\n" +
                "                <li><a href=\"/ciyuan/list/f\">F</a></li>\n" +
                "                <li><a href=\"/ciyuan/list/g\">G</a></li>\n" +
                "                <li><a href=\"/ciyuan/list/h\">H</a></li>\n" +
                "                <li><a href=\"/ciyuan/list/i\">I</a></li>\n" +
                "                <li><a href=\"/ciyuan/list/j\">J</a></li>\n" +
                "                <li><a href=\"/ciyuan/list/k\">K</a></li>\n" +
                "                <li><a href=\"/ciyuan/list/l\">L</a></li>\n" +
                "                <li><a href=\"/ciyuan/list/m\">M</a></li>\n" +
                "                <li><a href=\"/ciyuan/list/n\">N</a></li>\n" +
                "                <li><a href=\"/ciyuan/list/o\">O</a></li>\n" +
                "                <li><a href=\"/ciyuan/list/p\">P</a></li>\n" +
                "                <li><a href=\"/ciyuan/list/q\">Q</a></li>\n" +
                "                <li><a href=\"/ciyuan/list/r\">R</a></li>\n" +
                "                <li><a href=\"/ciyuan/list/s\">S</a></li>\n" +
                "                <li><a href=\"/ciyuan/list/t\">T</a></li>\n" +
                "                <li><a href=\"/ciyuan/list/u\">U</a></li>\n" +
                "                <li><a href=\"/ciyuan/list/v\">V</a></li>\n" +
                "                <li><a href=\"/ciyuan/list/w\">W</a></li>\n" +
                "                <li><a href=\"/ciyuan/list/x\">X</a></li>\n" +
                "                <li><a href=\"/ciyuan/list/y\">Y</a></li>\n" +
                "                <li><a href=\"/ciyuan/list/z\">Z</a></li>\n" +
                "            </ul>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "\n" +
                "    <div id=\"article\" class=\"content\">\n" +
                "        <div class=\"paging\"><ul><li><a class=\"current\" href=\"/ciyuan/page/a/0\">1</a> </li><li><a href=\"/ciyuan/page/a/1\">2</a> </li><li><a href=\"/ciyuan/page/a/2\">3</a> </li><li><a href=\"/ciyuan/page/a/3\">4</a> </li><li><a href=\"/ciyuan/page/a/4\">5</a> </li><li><a href=\"/ciyuan/page/a/5\">6</a> </li></ul></div><h2><a href=\"/ciyuan/s/Apollo\">Apollo</a>（美男子）：希腊神话中的光明神阿波罗</h2><p>阿波罗（Apollo）是希腊神话中奥林巴斯十二主神之一，是天神宙斯与暗夜女神勒托所生的儿子，月亮及狩猎女神阿尔忒弥斯的孪生弟弟，全名为福玻斯·阿波罗（Phoebus Apollo），意思是“光明”或“光辉灿烂”。阿波罗掌管光明、青春、音乐等。\n" +
                "</p><p>关于阿波罗的神话传说很多，比如：他替母复仇，在希腊的德尔斐杀死巨蟒，人们在德尔斐修建了闻名于世的德尔斐神庙。赫尔墨斯偷了他的牛，把自己发明的竖琴赔给阿波罗，使其成为音乐之神。\n" +
                "</p><p>擅长吹笛子的凡人马西亚斯（Marsyas）狂妄地挑战阿波罗，阿波罗把竖琴倒过来演奏，马西亚斯无法将笛子倒过来吹，只能认输，结果被阿波罗剥皮处死。\n" +
                "</p><p>特洛伊公主卡珊德拉答应与他恋爱，获得他传授的预言能力，后来公主食言，于是阿波罗诅咒她说出来的预言无人相信，因此在特洛伊战争中她的预言不被人们相信，特洛伊最终遭到毁灭。\n" +
                "</p><p>阿波罗因为嘲笑小爱神，中了小爱神的爱情之箭，疯狂爱上了宁芙仙女达芙妮，但达芙妮中了小爱神的铅箭，四处逃避他，最终被迫变成了月桂树。\n" +
                "</p><p>阿波罗是所有男神之中最英俊的，人们将他视为男性美的典范。因此，在英语中，Apollo成了“美男子”的代名词。\n" +
                "</p><p>Apollo：[ə'pɒləʊ] n.阿波罗，美男子\n" +
                "</p><p>apollonian：[,æpə'ləunjən] adj.阿波罗神的，高尚的\n" +
                "</p><p>like an Apollo：形容男子相貌堂堂，风度翩翩</p><p class=\"my-router\">该词的英语词源请访问趣词词源英文版：<a target=\"_blank\" href=\"/etym/s/Apollo\">Apollo</a> 词源，<a target=\"_blank\" href=\"/w/Apollo\">Apollo</a> 含义。</p><h2><a href=\"/ciyuan/s/aphrodisia\">aphrodisia</a>（性欲）：希腊神话中爱与美之女神阿芙洛狄忒</h2><p>阿芙洛狄忒（Aphrodite）是希腊神话中的爱与美之女神，对应于罗马神话中的维纳斯。她是奥林巴斯十二主神之一，是爱情和女性美的象征。她是众神仰慕的对象，据说神王宙斯也追求过她，被她拒绝后强行把她嫁个了丑陋的火神。阿佛洛狄忒与高大威猛的战神私通，生下了小爱神厄洛斯和其他子女。她还跟美男子阿多尼斯相爱。希腊和罗马神话中流传着大量她的风流韵事。\n" +
                "</p><p>阿芙洛狄忒的名字Aphrodite的意思是“水泡中产生的”，希腊词根aphro表示水泡。因为传说当克洛诺斯阉割乌拉诺斯后，乌拉诺斯的精血洒落在大海上，产生了很多泡沫，阿芙洛狄忒就从泡沫中诞生。从她的名字Aphrodite产生了不少跟性爱相关的词汇，如aphrodisia（性欲）、aphrodisiac（春药）。四月April也是以她的名字命名的。\n" +
                "</p><p>Aphrodite：[,æfrə'daɪti] n.阿佛洛狄忒\n" +
                "</p><p>aphrodisia：[,æfrəu'diziə]n.性欲，（医学）性欲炽盛\n" +
                "</p><p>aphrodisiac：[,æfrə'dɪzɪæk] n.春药adj.激发性欲的</p><h2><a href=\"/ciyuan/s/altas\">altas</a>（地图集）：希腊神话中的擎天神阿特拉斯</h2><p>阿特拉斯（Atlas）是希腊神话中的擎天神。他属于泰坦神族，是十二泰坦神之一的伊阿珀托斯（Iapetus）的儿子，“盗火者”普罗米修斯的哥哥。泰坦神族被奥林巴斯神族打败后，参与反叛的阿特拉斯被宙斯惩罚，被迫在世界的西边以双肩擎住被放逐的天神乌拉诺斯，以免他返回地面与大地女神盖亚做爱。\n" +
                "</p><p>传说阿特拉斯背负苍天，痛苦不堪。英雄帕尔修斯砍下美杜莎的头后经过此地，阿特拉斯就请求帕尔修斯，用美杜莎的眼睛正对他，将他变成了石头。因为阿特拉斯特别高大，而变成一座山，这座山就是非洲北部的阿特拉斯山脉，这条山脉西边的大海（大西洋）也以阿特拉斯命名。\n" +
                "</p><p>阿特拉斯的名字Atlas在希腊语中的原意是“擎者”。16世纪，地理学家麦卡脱把阿特拉斯擎天图作为一本地图册的卷首插图。后人争相效仿，单词atlas从此被用来表示地图集。阿特拉斯所擎的圆球本是苍天，但后人常常误解为地球。\n" +
                "</p><p>atlas：['ætləs] n.地图集，寰椎。\n" +
                "</p><p>Atlantic：[æt'læntɪk]n.大西洋。\n" +
                "</p><p>Atlanta：[æt'læntə]n.亚特兰大。\n" +
                "</p><p>Atlantis：[ət'læntis]n.亚特兰蒂斯，传说中神秘消失于大西洋的古老大陆大西洲。</p><h2><a href=\"/ciyuan/s/Athens\">Athens</a>（雅典）：希腊神话中的智慧女神雅典娜</h2><p>希腊神话中，雅典娜（Athena）是奥林巴斯十二主神之一，是神王宙斯与聪慧女神墨提斯的女儿。据说，宙斯推翻父亲成为神王后，大地女神盖亚和天神乌拉诺斯预言他会被墨提斯所生的儿子推翻。宙斯害怕预言成真，就把墨提斯整个吞入肚中（比他老爸还狠）。后来宙斯头疼难忍，就叫火神劈开他的头颅。随后就见披甲持枪的雅典娜从宙斯的头中跳了出来。\n" +
                "</p><p>因为雅典娜的身上集合了母亲的智慧和父亲的威力，所以她既是智慧女神，又是女战神。但她与战神阿瑞斯不同，她代表了战争的智慧与计谋。在特洛伊战场上，雅典娜曾经将草包战神及其情人爱神打得屁滚尿流。\n" +
                "</p><p>雅典娜是希腊城市雅典的庇护神。传说，希腊人在爱琴海边新建了一座城。雅典娜和海神波塞冬都想成为这座城的庇护神，互不相让。宙斯裁定，每个人给这座城市送一件礼物。谁的礼物被选中，该城就归属谁。波塞冬的礼物是象征战争利器的战马，而雅典娜的礼物是象征和平的橄榄枝。雅典人选中了和平而不是战争，于是雅典娜就成为了雅典的庇护神。\n" +
                "</p><p>希腊城市雅典（Athens）的名字就来自雅典娜的名字Athena。另外，表示“图书馆”的单词athenaeum也来自雅典娜的名字。\n" +
                "</p><p>Athena： [ə'θi:nə]n.雅典娜\n" +
                "</p><p>Athens： ['æθɪnz] n.雅典</p><h2><a href=\"/ciyuan/s/argus\">argus</a>（警惕的人）：希腊神话中的百眼巨人阿尔戈斯</h2><p>阿尔戈斯Argus是希腊神话中的百眼巨人。他有100只眼睛，分布在全身，可以观察到各个方向发生的事情，即使睡觉时也有两只眼睛睁着。据说有一次宙斯下凡勾引凡间美女伊娥，为了遮人耳目就变出一团云雾笼罩在周围。天后赫拉心生怀疑，驱散云雾，宙斯赶紧将伊娥变出一头雪白的小母牛。赫拉看穿了宙斯的诡计，假意喜欢这头牛，要求宙斯把这头牛送给自己作宠物，然后派阿尔戈斯严密监视小母牛。宙斯派自己的儿子，神使赫尔墨斯前去解救伊娥。赫尔墨斯用笛子吹出动听的音乐，还给他讲潘神追求宁芙仙女不成最后发明潘神萧的故事，引诱阿尔戈斯闭上所有眼睛入睡。赫尔墨斯趁阿尔戈斯睡着后砍下了他的头，救出了伊娥。后来赫拉将阿尔戈斯的100只眼睛转移到她最宠爱的鸟——孔雀的尾羽上。从此以后，孔雀的尾羽上长满了眼睛一样的美丽花纹。\n" +
                "</p><p>阿尔戈斯的名字在希腊语中是Argos，含义是“（目光）明亮的”。在英语中，argus用来比喻“警惕的人”。英国海军二战前的一艘航空母舰、美国2012年推出的一款无人驾驶侦察机都叫做Argus。\n" +
                "</p><p>argus：['ɑːgəs] n.警惕的人，百眼巨人\n" +
                "</p><p>argus-eyed：adj.警惕的，目光敏锐的</p><h2><a href=\"/ciyuan/s/amethyst\">amethyst</a>（紫水晶）：拒绝酒神追求的凡人少女艾莫西施</h2><p>希腊酒神狄俄尼索斯（Dionysus）善于酿造葡萄酒，同时还特别喜爱饮酒。酒神爱上了一个美丽的凡人少女艾莫西施 （Amethystos，希腊语含义为“不醉酒”），向她展开了热烈的追求，但遭到了艾莫西施（Amethystos）的拒绝。一日，酒神喝醉后，欲强行非礼艾莫西施（Amethystos）。情急之下， 艾莫西施向月亮女神Diana大声呼救。于是，月亮女神将她变成了一块晶莹透体的水晶，保住了她的贞洁。酒神伤心不已，就将葡萄酒浇灌在水晶身上，使其变为紫色。\n" +
                "</p><p>英语单词amethyst（紫水晶）就来源于这则希腊神话。古希腊人相信，紫水晶具有防止醉酒的功效，因此在饮酒时喜欢使用紫水晶做成的葡萄酒杯或在身上佩戴一块紫水晶做成的饰品，来避免自己喝醉。\n" +
                "</p><p>amethyst：['æməθɪst] n.紫水晶，紫色</p><h2><a href=\"/ciyuan/s/Amazon\">Amazon</a>（亚马逊）：希腊神话中割乳以便射箭的彪悍女战士</h2><p>希腊神话中，在Scythia（赛西亚）地区居住着一个Amazon部落，由高大彪悍、作战勇猛的女战士组成。为了不妨碍拉弓射箭，她们甚至将自己的右乳割去。她们的部落名称Amazon意思就是“没有乳房”，其中的 a=without（没有），mazon=breast（乳房）。她们由女王统治，崇拜战神阿瑞斯，认为自己是战神的后代。为了传宗接代，她们每年都会和附近的部落举行联姻大会，生下的女婴会留下，生下的男婴会被杀死或返还给父亲。\n" +
                "</p><p>关于亚马逊女战士的传说一直是古希腊艺术家最喜爱的主题之一。据说一共只有三位希腊英雄战胜过亚马逊人，分别是赫拉克勒斯、忒修斯和阿喀琉斯。\n" +
                "</p><p>传说，大英雄赫拉克勒斯所要完成的12项任务中，其中的一项任务就是夺取亚马逊女王希波吕忒的腰带。这条腰带传说是战神亲自送给女王的，是女王权力的象征。本来，女王对赫拉克勒斯一见倾心，早有意献出腰带。但天后赫拉嫉恨赫拉克勒斯，便在部落中散布谣言，说赫拉克勒斯要绑架她们的女王。于是亚马逊女战士们倾巢而出，与赫拉克勒斯大战一场。赫拉克勒斯连续击败了多名最强大的亚马逊女战士并俘虏了亚马逊女战士的军队领袖后，亚马逊女战士才溃败，希波吕忒女王也献出了早已许诺的腰带。\n" +
                "</p><p>另一位英雄忒修斯曾经造访亚马逊部落，受到热情款待。忒修斯对亚马逊女王安提奥珀一见倾心，但女王不为所动。于是忒修斯将女王骗到雅典欲强行成亲。亚马逊人包围了雅典，与女王里应外合展开战斗。女王在战斗中壮烈牺牲。雅典人和亚马逊人互有胜负，最后不得不缔结和约，亚马逊人才撤走。\n" +
                "</p><p>在特洛伊战争中，阿喀琉斯杀死赫克托耳后，特洛伊人落入下风。此时，亚马逊女王彭忒西勒亚带领十二名女战士赶赴特洛伊城，帮助他们一起对抗希腊人。阿喀琉斯与女王大战一场，最后杀死了女王。等他摘下女王脸上的头盔时才发现被自己杀死的是一名妩媚的女人，后悔不已，陷入了巨大悲痛。\n" +
                "</p><p>16世纪西班牙探险家Francisco de Orellana在南美洲的一条大河河畔与当地一土著部落交战，发现部落的女战士英勇异常，与传说中的亚马逊人非常相似，遂根据希腊神话，将该河命名为亚马逊河。\n" +
                "</p><p>Amazon： ['æməzən] n.亚马逊，古希腊生活中的女战士</p><h2><a href=\"/ciyuan/s/academy\">academy</a>（学院）：希腊神话中帮助寻回美女海伦的农夫阿卡德摩斯</h2><p>在希腊神话传说中有一位绝世美女海伦。她是宙斯和斯巴达王后勒达所生。当她还是一名少女的时候，来自雅典的英雄忒修斯与朋友偶然在神庙中看见海伦跳舞。两人惊为天人，闯进神庙将海伦劫走。两人决定抽签确定海伦的归属，并约好抽中的人要帮没抽中的人再去抢个妻子。结果忒修斯抽中了，于是忒修斯把海伦带回老家，嘱咐母亲好生照顾。然后，两个好朋友再次出发去做采花大盗。这回他们看上了冥王的妻子珀耳塞福涅，可惜行动失败，被冥王关押在冥府中。后来另一个英雄赫拉克勒斯前往冥府营救，但只救出了忒修斯一人。\n" +
                "</p><p>海伦的两个哥哥率军四处寻找海伦。他们来到雅典，要求雅典人归还自己的妹妹。但雅典人说不知道是谁劫走了海伦。两兄弟威胁要动用武力。正在这危急时刻，一个名叫阿卡德摩斯（Akademos）的农夫挺身而出，提供了绑架者的身份和藏匿之所。两兄弟很快就夺回了自己的妹妹，而Akademos也因为避免了一场战争而成为雅典的英雄，得到神灵的庇佑，他的橄榄树林年年丰收。这片橄榄树林也因此得名Akademeia，意思是“Akademos的果园”。\n" +
                "</p><p>后来，希腊大哲学家柏拉图在这片橄榄树林里创建了学园。人们将他的学园也称为Akademeia。英语单词academy就来源于柏拉图创建的Akademeia学园，原本专指柏拉图所创建的学园，但后来词义进一步扩充，泛指各种学术研究性机构。\n" +
                "</p><p>academy：[ə'kædəmɪ] n.学院，研究院，学会，专科院校\n" +
                "</p><p>academic：[ækə'demɪk] adj.学术的，学院的，理论的n.学者，大学教师，大学生</p><h2><a href=\"/ciyuan/s/adonis\">adonis</a>（美男子）：捕获爱神芳心的的美少年阿多尼斯</h2><p>阿多尼斯Adonis是希腊神话中的美男子。他的母亲是绝世美女米拉（Myrrha），因为受到爱神的诅咒与父亲乱伦怀上了他。米拉后来被神化为一颗没药树（myrrh），阿多尼斯就在树中孕育，后来树皮爆裂而诞生。传说阿多尼斯身高九尺，五官精致如花，世间一切人和物都在他面前黯然失色。爱神阿芙洛狄忒狂热地爱上了他，引起了战神的嫉恨。战神就施展法力，准备在阿多尼斯狩猎时化作一头野猪杀死他。爱神事先收到预言，知道阿多尼斯将在狩猎中死去，所以极力阻拦。但阿多尼斯不肯相信，坚持去狩猎，结果果然被野猪杀死。\n" +
                "</p><p>阿多尼斯死后，爱神伤心不已，将其鲜血化为红玫瑰，尸体化为秋牡丹花。冥后珀耳塞福涅见爱神如此悲痛，便让阿多尼斯于每年有6个月回到阳间与爱神团圆。后来阿多尼斯成了植物之神，每年死而复生，永远年轻容颜不老。\n" +
                "</p><p>在英语中，阿多尼斯的名字Adonis成了“美男子”的代名词，并衍生了小写的单词adonis。美丽而又毒性致命的福寿草也以adonis命名，传说这种植物由阿多尼斯死时的鲜血所化。\n" +
                "</p><p>adonis：[ə'dəunis] n.美男子，美少年，福寿草</p><h2><a href=\"/ciyuan/s/abyss\">abyss</a>（无底洞）：基督教中关押反叛天使的无底地狱</h2><p>英语单词abyss源自希腊语abyssos，由否定前缀a-和byssos（底，bottom）组成，意为“无底洞”。\n" +
                "</p><p>根据基督教的教义，上帝带圣子基督巡游天界，让众天使向圣子下跪参拜。天界中地位最高的天使长路西法Lucifer拒绝向人类出身的圣子基督臣服，率领三分之一的天使造反。经过三天的激战，圣子基督战胜反叛天使，将其打入永劫的无底洞abyss。除路西法外，所有反叛天使都被除名，蜕变为丑恶形象，只有路西法依然保持六翼天使的光辉形象。被打入无底洞的路西法就是后来的撒旦。\n" +
                "</p><p>按照但丁在《神曲》中的描写，abyss位于地狱（inferno）的最底层，是关押恶魔和反叛天使的地方。在佛教中，八大地狱中的第八个地狱叫做“阿鼻地狱”，“阿鼻”的意思是“无间”，表示在该地狱中要承受永恒的痛苦，从不间断。abyss的发音与“阿鼻”很接近，一个表示基督教中的“无底地狱”，一个表示佛教中的“无间地狱”。\n" +
                "</p><p>abyss：[ə'bɪs] n.无底洞，地狱，深渊。记：阿鼻地狱\n" +
                "</p><p>abyssal：[ə'bɪsl] adj.深渊的，深海的，深不可测的</p><h2><a href=\"/ciyuan/s/auspice\">auspice</a>（赞助）：古罗马人的观鸟占卜法</h2><p>古罗马的伊特鲁利亚人有通过观看飞鸟来占卜凶吉的做法。巫师用一个魔杖（lituus）在天空中画出一个区域，观察鸟在该区域的飞行，通过鸟的飞行来判断吉凶。这种观鸟占卜法称为auspice，源自拉丁语avis（bird，鸟）+specere（look，看）。后来，auspice的含义演变为占卜时取得的吉兆，并逐渐衍生出“赞助、主办”的意思，因为吉兆不就是老天爷的支持和赞助吗？\n" +
                "</p><p>执行观鸟占卜的巫师叫做auspex，也叫做augur，所以观鸟占卜法也被称为augury。\n" +
                "</p><p>古罗马人就职时，往往会先进行占卜，占得吉兆才会举行就职仪式。所以表示就职的单词是inaugurate，源自拉丁语in（into，入职）+augurare（augury，占卜）构成，字面意思就是“占卜取得吉兆后就职”。\n" +
                "</p><p>auspice：['ɔːspɪs] n.吉兆，赞助，主办\n" +
                "</p><p>auspex： ['ɔːspeks] n. 鸟卜者；占卜者\n" +
                "</p><p>augur：['ɔːgə] n.占卜师，预言者v.预言，占卜\n" +
                "</p><p>augury：['ɔːgjʊrɪ] n.占卜，预言，预兆\n" +
                "</p><p>inaugurate：[i'nɔ:ɡjureit]vt.举行就职典礼，开辟，创新，开始\n" +
                "</p><p>inauguration：[ɪ,nɔːgjʊ'reɪʃ(ə)n] n.就职典礼，开幕式，开创</p><h2><a href=\"/ciyuan/s/atone\">atone</a>（赎罪）：与上帝保持和谐一致的关系</h2><p>atone本来是at one的缩写，是“归一，与……保持一致”的意思。基督教中，牧师布道时经常要求教徒“to be at one with God”，意思是与上帝保持和谐一致。按照基督教的教义，上帝与人类在生命和利益上原本是完美和谐的。但是，由于人类始祖亚当与夏娃违反上帝的禁令，偷吃禁果，犯下“原罪”，因此，上帝与人类产生了隔阂和疏远。因此，基督教徒要想与上帝重归于好，就必须进行赎罪，以扫清和解的阻碍。所以，单词atone一词逐渐演变为“赎罪、弥补”之意。\n" +
                "</p><p>atone： [ə'təʊn] v.赎罪，弥补，偿还。记：at+one→归一，保持一致→与上帝保持一致→赎罪、弥补\n" +
                "</p><p>atonement： [ə'təʊnm(ə)nt] n.赎罪，补偿，弥补</p><h2><a href=\"/ciyuan/s/angel\">angel</a>（天使）：上帝与凡人交流的信使</h2><p>英语单词angel源自希腊单词angelos，原意是“信使”。在犹太教中，天使是上帝与凡人的沟通渠道，上帝的言语是通过天使来传递给凡人的，因为凡人无法承受上帝声音的巨大能量。希腊人将希伯来语的旧约翻译成希腊语时，就用angelos这个词来表示天使，后来演变成为英语单词angel。\n" +
                "</p><p>在犹太教、基督教和伊斯兰教中，都有使者这一概念，在中文中翻译为天使。在最初的犹太宗教中，天使是圣经中所提到的一种大能的灵体生物，由上帝耶和华所造，具有自由意志，故有反抗上帝而被打入地狱的“堕落天使”。《圣经》和《古兰》都认为天使是没有实体的灵体。在艺术作品中天使有时是人形，身上发光，头顶有光环，有的长有翅膀。\n" +
                "</p><p>天使会保护圣徒和善人，也会根据上帝的指令，严厉惩罚恶人，如毁灭罪恶之城所多玛、蛾摩拉，一夜之间杀死十八万五千亚述人士兵、令所有埃及人的头一胎婴儿和家畜死亡等。\n" +
                "</p><p>angel： ['eɪndʒ(ə)l]n.天使，守护神。</p><h2><a href=\"/ciyuan/s/anthem\">anthem</a>（赞美诗）：由唱诗班应答轮唱的圣歌</h2><p>anthem最初是教堂里应答轮唱的圣歌。它和单词antiphon（轮流吟唱的歌）一样都来自希腊语antiphona。词根anti表示“against”或“in return”，phona是phone的变形，表示“sound”。这个词几经周折，最后演变成英语中的anthem，前三个字母ant还能依稀辨别出anti（in return）的痕迹。\n" +
                "</p><p>anthem原本是教堂尤其是英格兰教堂在宗教仪式中所唱的圣歌，由唱诗班而不是会众来合唱。而在现代，anthem一词已经超越宗教领域，用来表示那种用于庆祝或为特定群体而作的歌曲，如national anthem就是“国歌”、 sports anthem（体育圣歌）就是大型体育赛会中所用的歌曲，如We Are the Champions（我们是冠军）就是一首非常出名的体育圣歌。\n" +
                "</p><p>anthem：n.赞美诗，圣歌v.唱赞美诗，唱赞歌。\n" +
                "</p><p>antiphon： ['æntɪf(ə)n] n.轮流吟唱的歌，对唱的圣歌</p><h2><a href=\"/ciyuan/s/atom\">atom</a>（原子）：不可再细分的最小颗粒</h2><p>古希腊人认为，物质是不可能无限地分割下去的，到最后会小到不可再分，这种不可再分的最小微粒就是“原子”。最先提出原子学说的是古希腊爱奥尼亚学派中的留基伯。他的学生德谟克利特继承并发展了原子学说，并用原子学说来解释宇宙。他认为宇宙由原子和虚空组成，原子从古以来就存在于虚空之中，既不能创生，也不能毁灭，它们在无限的虚空中运动着构成万物。他还提出原子在数量上无限，在形式上是多样的，如水的原子是圆而光滑的，它们相互间不能“勾住”，因而就像小球那样相互滚来滚去，而铁的原子则粗糙不平，因而互相粘附在一起成为“固体”，火的原子是多刺的，这便是烧灼使人感到痛的原因。\n" +
                "</p><p>在希腊语中，原子被称作atomos，由a（not）+tomos（cut）构成，意思就是“不可分割）。后来这个词进入英语，演变为atom。 当然，现在我们知道原子并非不可分割，比原子更小的是夸克。\n" +
                "</p><p>atom： ['ætəm] n.原子</p><h2><a href=\"/ciyuan/s/adept\">adept</a>（能手）：炼金术士的荣誉称号</h2><p>中世纪，那些声称掌握了炼金术秘诀的炼金术士喜欢用拉丁语adeptus自诩。adeptus意指“已达到的”，“已获得的”。到了l7世纪，adeptus变成了顶级炼金术士的荣誉称号。随着炼金术的逐步衰亡，adeptus变成了一个通用词汇。英语单词adept就源自该拉丁词，表示”擅长的”或“熟练的”，也可作名词用，指“能手”、“内行”。\n" +
                "</p><p>adept： [ə'dept; 'ædept] adj. 熟练的；擅长…的n. 内行；能手</p><h2><a href=\"/ciyuan/s/arrive\">arrive</a>（到达）：船只抵达河岸</h2><p>英语单词arrive（到达）与river（河流）有关系吗？没错，它们是同源词。古代交通不发达，公路很少，所以天然形成的河流及大洋是非常重要的交通途径。英语单词arrive（到达）就与古代的水运方式有关。arrive源自拉丁语arripare，由ad+ripa构成。ad表示toward, near（靠近），因为后面的ripa以r开头所以改写为ar；ripa表示“河岸、海岸”，如英语单词riparian（河边居民）。英语单词river（河流）与arrive同源，它源自拉丁语riparius（河岸的）。\n" +
                "</p><p>arrive：[ə'raɪv] vi.达到，达成。记：ar（ad，靠近）+rive（river的岸边）→靠岸\n" +
                "</p><p>arrival：[ə'raɪv(ə)l] n.到达，到来，到达者\n" +
                "</p><p>river：['rɪvə] n.河，江\n" +
                "</p><p>riparian： [raɪ'peərɪən] n.河边居民，河岸拥有者adj.河边的</p><h2><a href=\"/ciyuan/s/aftermath\">aftermath</a>（后果）：刈割后的再生牧草</h2><p>英语单词aftermath是after math（数学之后）的意思吗？当然不是。这里的math来自古英语，等于mow（割草）。该词的由来与牧草有关。\n" +
                "</p><p>在广阔的草原上，牧草拥有很强的再生能力，能在刈割或放牧后再次生长。游牧民族很早就发现了牧草的再生能力，并在放牧时加以充分利用，并将第一次刈割后的再生牧草称为aftermath，意思就是“after the first mowing”（经过初次刈割后），即“再生草、第二茬草”。后来，aftermath的词义逐渐扩充，除了牧草以外，还可以表示其他事物的第二波次，如地震的余波。后来词义继续扩大，用来表示某一事物带来的结果。由于第二茬牧草的质量往往不如头生的，所以aftermath往往表示不好的结果，中文中一般译为“后果”。\n" +
                "</p><p>aftermath：['ɑːftəmæθ] n.后果，余波，再生草</p><h2><a href=\"/ciyuan/s/alcohol\">alcohol</a>（酒精）：古代中东妇女用来画眼影的锑粉</h2><p>长久以来，阿拉伯、波斯、新疆等地的妇女就已经发现锑粉是一种极好的化妆品。她们用从锑石中精炼提纯的锑粉涂在眼圈附近，不仅能使眼睛更漂亮，还能消除眼疲劳和红肿的功效。阿拉伯妇女喜欢用锑粉画出浓重的眼影，埃及艳后克娄巴特拉的妆容便是典型。这种用来画眼影的锑粉在阿拉伯语中叫做al kuhul，其中的al是定冠词，相当于英语中的the。英语单词alcohol就源自al kuhul，原本表示“粉末状的化妆品”，17世纪词义扩大为“物品的精华、精炼提纯结果”。18世纪，人们用alcohol of wine（酒的精华）来表示酒精，后来直接用alcohol一词来表示酒精。\n" +
                "</p><p>阿拉伯语中表示锑粉，不带定冠词al的kuhul一词后来通过其他途径也进入了英语，演变成为英语单词kohl，依然保持原意，表示“眼影粉”。\n" +
                "</p><p>alcohol： ['ælkəhɒl] n.酒精，乙醇\n" +
                "</p><p>alcoholic： [ælkə'hɒlɪk] adj.酒精的，含酒精的n.酒鬼，酗酒者\n" +
                "</p><p>kohl： [kəʊl] n.眼影粉，化妆墨</p><h2><a href=\"/ciyuan/s/album\">album</a>（相册）：古罗马时期的白色公告板</h2><p>古罗马政府每天在议事厅外的广场上，以手抄公告方式，向市民报道重大公事，如议案进程，审判结果等。这种手抄公告被历史学家称为“每日纪闻”（Acta Diurna），先后出版数百年之久，有人称之为“历史上第一份官方的报刊”。它其实是一块树立在广场中的木板，上面涂有白蜡，由专人每天在上面发布公告。这份最早的报刊在当时叫做album，本意是“白色”，是拉丁语albus（白）的中性形式，英语词根alb（白）也源自albus。\n" +
                "</p><p>16世纪时，人们使用一种空白的本子来搜集名人的签名，并把这种本子也叫做album，意思就是“空白的本子”。19世纪，人们管相册、集邮册也叫做album，因为它们都是“空白的本子”。到了20世纪50年代，唱片问世后，人们管唱片也叫做album，因为唱片的封套很像一个album。\n" +
                "</p><p>album：['ælbəm] n.相册，唱片集，集邮册，签名纪念册。记：alb白+um场所→空白之处→空白的本子\n" +
                "</p><p>albino：[æl'biːnəʊ] n.白化病，白化病人\n" +
                "</p><p>Alps： [ælps] n.阿尔卑斯山。记：alp=alb,白色的山\n" +
                "</p><p>albumin： ['ælbjʊmɪn] n.白蛋白，清蛋白</p><div class=\"paging\"><ul><li><a class=\"current\" href=\"/ciyuan/page/a/0\">1</a> </li><li><a href=\"/ciyuan/page/a/1\">2</a> </li><li><a href=\"/ciyuan/page/a/2\">3</a> </li><li><a href=\"/ciyuan/page/a/3\">4</a> </li><li><a href=\"/ciyuan/page/a/4\">5</a> </li><li><a href=\"/ciyuan/page/a/5\">6</a> </li></ul></div>    </div>\n" +
                "</div>\n" +
                "<script>\n" +
                "    document.getElementById('yd-search').onsubmit = function() {\n" +
                "        var word = this.wd.value.replace(/\\u3000/g, ' ').replace(/(^\\s+|\\s+$)/g, '');\n" +
                "        if (word == '') {\n" +
                "            return false;\n" +
                "        } else if (word.search(/^[\\w \\-]+$/) == 0) {\n" +
                "            top.location.href = '/ciyuan/s/' + encodeURIComponent(word.replace(/ /g, '_'));\n" +
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
                "<script>\n" +
                "    $('#article > p').html(function() {\n" +
                "        var str_text = $(this).text().trim();\n" +
                "        if (str_text.search('趣词词源') == -1) {\n" +
                "            if (str_text.search(/^[a-z \\-]+：/i) == 0) {\n" +
                "                return str_text.replace(/[a-z \\-]+/i, function(match) {\n" +
                "                    match = match.trim();\n" +
                "                    var match_url = match.replace(/ /g, '_');\n" +
                "                    return '<a target=\"_blank\" href=\"/etym/s/' + match_url + '\">' + match + '</a>';\n" +
                "                }).replace(/[a-z]+\\./g, ' <strong>$&</strong> ');\n" +
                "            } else {\n" +
                "                return str_text.replace(/([^a-z\\u0080-\\u03ff\\[\\'\\,\\:]|^)([a-z \\-\\.\\'\\,\\:]+)(?![a-z\\u0080-\\u03ff\\]\\'\\,\\:])/ig, '$1 <strong>$2</strong> ');\n" +
                "            }\n" +
                "        }\n" +
                "    }).html(function(index, str_html) {\n" +
                "        return str_html.replace(/^(发音释义|结构分析|词源解释|同源词|背景知识|助记窍门|衍生词|常见搭配|趣味记忆|词根分析)：/, '【$1】：');\n" +
                "    });\n" +
                "</script>\n" +
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
        List<Origin> origins = new ArrayList<>();
        Document document = Jsoup.parse(s, "utf-8");
        Element article = document.getElementById("article");
        Elements wordAndMeanNodes = article.children();
        Elements allElements = article.getElementsByTag("h2");
        for (int i = 0; i < allElements.size(); i++) {
            Element element = allElements.get(i);
            Elements children1 = element.children();
            String word = children1.get(0).ownText();
            String means = element.ownText();
            List<String> originsMeans = new ArrayList<>();

            int index = wordAndMeanNodes.indexOf(element);
            for (int j = 0; j < wordAndMeanNodes.size(); j++) {
                Element element2 = wordAndMeanNodes.get(index + 1);
                String name = element2.tag().getName();
                if (!"p".equals(name)) {
                    break;
                }
                String s1 = element2.text();
                originsMeans.add(s1);
                index++;

            }
            Origin origin = new Origin(word, means, originsMeans);
            origins.add(origin);
        }
        int i = 0;
    }


}

class Origin {
    String word;
    String mean;
    List<String> originMeans;

    public Origin(String word, String mean, List<String> originMeans) {
        this.word = word;
        this.mean = mean;
        this.originMeans = originMeans;
    }

    @Override
    public String toString() {
        return "Origin{" +
                "word='" + word + '\'' +
                ", mean='" + mean + '\'' +
                ", originMeans=" + originMeans +
                '}';
    }
}
