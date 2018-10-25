package com.example.book.service.Impl;

import com.example.book.entity.Book;
import com.example.book.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookServiceImplTest {
    @Resource
    private BookService bookService;

    @Test
    public void save() {
        String[] names = {"圣殿春秋", "往事与随想", "西西里柠檬", "铁道之旅", "侠隐",
                "天长地久", "鞑靼人沙漠", "潦草", "双峰：最终档案", "老后破产"};
        String[] authors = {"[英] 肯·福莱特", "[俄] 赫尔岑", "[美]威廉·福克纳 等", "[德]沃尔夫冈•希弗尔布施", "张北海",
                "龙应台", "[意] 迪诺·布扎蒂", "贾行家", "[美]马克·弗罗斯特", "日本NHK特别节目录制组"};
        String[] avatars = {"http://pa4uq3179.bkt.clouddn.com/a.jpg",
                "http://pa4uq3179.bkt.clouddn.com/b.jpg",
                "http://pa4uq3179.bkt.clouddn.com/c.jpg",
                "http://pa4uq3179.bkt.clouddn.com/d.jpg",
                "http://pa4uq3179.bkt.clouddn.com/e.jpg",
                "http://pa4uq3179.bkt.clouddn.com/f.jpg",
                "http://pa4uq3179.bkt.clouddn.com/g.jpg",
                "http://pa4uq3179.bkt.clouddn.com/h.jpg",
                "http://pa4uq3179.bkt.clouddn.com/i.jpg",
                "http://pa4uq3179.bkt.clouddn.com/j.jpg",};
        String[] remarks = {"上帝可以是假的，天堂可以不存在，但教堂是可以造出来的。",
                "他无异于他所观察的人群。",
                "他无异于他所观察的人群。",
                "他无异于他所观察的人群。",
                "写的是逝去的武林，也是逝去的古都。",
                "他无异于他所观察的人群。",
                "他无异于他所观察的人群。",
                "他无异于他所观察的人群。",
                "他无异于他所观察的人群。",
                "他无异于他所观察的人群。",};
        String[] types = {"外国文学 / 历史",
                "回忆录 / 苏俄文学",
                "《世界文学》 / 短篇",
                "铁路 / 历史社会学",
                "老北京 / 武侠",
                "亲情 / 散文",
                "意大利文学 / 小说",
                "外国文学 / 历史",
                "外国文学 / 历史",
                "日本 / 老龄化"};
        for (int i = 0; i < 10; i++) {
            Book book = new Book();
            book.setAuthor(authors[i]);
            book.setAvatar(avatars[i]);
            book.setName(names[i]);
            book.setPages("1503页");
            book.setPrice("28元");
            book.setPublish("Java出版社");
            book.setRemark(remarks[i]);
            book.setType(types[i]);
            System.out.println(bookService.save(book));
        }

    }


}