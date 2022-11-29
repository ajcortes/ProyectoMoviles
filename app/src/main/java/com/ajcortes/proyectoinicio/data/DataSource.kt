package com.ajcortes.proyectoinicio.data

object DataSource {
    fun getFilmList(): MutableList<Film>{
        val filmList = mutableListOf<Film>(
            Film(
                "天空の城ラピュタ",
                "Castle in the Sky",
                "The orphan Sheeta inherited a mysterious crystal that links her to the mythical sky-kingdom of Laputa. With the help of resourceful Pazu and a rollicking band of sky pirates, she makes her way to the ruins of the once-great civilization. Sheeta and Pazu must outwit the evil Muska, who plans to use Laputa's science to make himself ruler of the world.",
                "Hayao Miyazaki",
                "Isao Takahata",
                "1986",
                "124",
                "95",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/npOnzAbLh6VOIu3naU5QaEcTepo.jpg",
                "https://image.tmdb.org/t/p/w533_and_h300_bestv2/3cyjYtLWCBE1uvWINHFsFnE8LUK.jpg"
            ),
            Film(
                "火垂るの墓",
                "Grave of the Fireflies",
                "In the latter part of World War II, a boy and his sister, orphaned when their mother is killed in the firebombing of Tokyo, are left to survive on their own in what remains of civilian life in Japan. The plot follows this boy and his sister as they do their best to survive in the Japanese countryside, battling hunger, prejudice, and pride in their own quiet, personal battle.",
                "Isao Takahata",
                "Toru Hara",
                "1988",
                "89",
                "97",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/qG3RYlIVpTYclR9TYIsy8p7m7AT.jpg",
                "https://image.tmdb.org/t/p/original/vkZSd0Lp8iCVBGpFH9L7LzLusjS.jpg"
            ),
            Film(
                "となりのトトロ",
                "My Neighbor Totoro",
                "Two sisters move to the country with their father in order to be closer to their hospitalized mother, and discover the surrounding trees are inhabited by Totoros, magical spirits of the forest. When the youngest runs away from home, the older sister seeks help from the spirits to find her.",
                "Hayao Miyazaki",
                "Hayao Miyazaki",
                "1988",
                "86",
                "93",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/rtGDOeG9LzoerkDGZF9dnVeLppL.jpg",
                "https://image.tmdb.org/t/p/original/etqr6fOOCXQOgwrQXaKwenTSuzx.jpg"
            ),
            Film(
                "魔女の宅急便",
                "Kiki's Delivery Service",
                "A young witch, on her mandatory year of independent life, finds fitting into a new community difficult while she supports herself by running an air courier service.",
                "Hayao Miyazaki",
                "Hayao Miyazaki",
                "1989",
                "102",
                "96",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/7nO5DUMnGUuXrA4r2h6ESOKQRrx.jpg",
                "https://image.tmdb.org/t/p/original/h5pAEVma835u8xoE60kmLVopLct.jpg"
            ),
            Film(
                "おもひでぽろぽろ",
                "Only Yesterday",
                "It’s 1982, and Taeko is 27 years old, unmarried, and has lived her whole life in Tokyo. She decides to visit her family in the countryside, and as the train travels through the night, memories flood back of her younger years: the first immature stirrings of romance, the onset of puberty, and the frustrations of math and boys. At the station she is met by young farmer Toshio, and the encounters with him begin to reconnect her to forgotten longings. In lyrical switches between the present and the past, Taeko contemplates the arc of her life, and wonders if she has been true to the dreams of her childhood self.",
                "Isao Takahata",
                "Toshio Suzuki",
                "1991",
                "118",
                "100",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/xjJU6rwzLX7Jk8HFQfVW6H5guMC.jpg",
                "https://image.tmdb.org/t/p/w533_and_h300_bestv2/isCrlWWI4JrdLKAUAwFb5cjAsH4.jpg"
            ),
            Film(
                "もののけ姫",
                "Princess Mononoke",
                "Ashitaka, a prince of the disappearing Ainu tribe, is cursed by a demonized boar god and must journey to the west to find a cure. Along the way, he encounters San, a young human woman fighting to protect the forest, and Lady Eboshi, who is trying to destroy it. Ashitaka must find a way to bring balance to this conflict.",
                "Hayao Miyazaki",
                "Toshio Suzuki",
                "1997",
                "134",
                "92",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/jHWmNr7m544fJ8eItsfNk8fs2Ed.jpg",
                "https://image.tmdb.org/t/p/original/6pTqSq0zYIWCsucJys8q5L92kUY.jpg"
            ),
            Film(
                "千と千尋の神隠し",
                "Spirited Away",
                "Spirited Away is an Oscar winning Japanese animated film about a ten year old girl who wanders away from her parents along a path that leads to a world ruled by strange and unusual monster-like animals. Her parents have been changed into pigs along with others inside a bathhouse full of these creatures. Will she ever see the world how it once was?",
                "Hayao Miyazaki",
                "Toshio Suzuki",
                "2001",
                "124",
                "97",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/39wmItIWsg5sZMyRUHLkWBcuVCM.jpg",
                "https://image.tmdb.org/t/p/original/bSXfU4dwZyBA1vMmXvejdRXBvuF.jpg"
            )
        )
        return filmList
    }
}