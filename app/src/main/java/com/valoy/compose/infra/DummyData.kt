package com.valoy.compose.infra

import com.valoy.compose.domain.model.Article

class DummyData {

    companion object{
        val ARTICLES_RESOURCES = mutableListOf(
            Article(
                id = "1",
                title = "Android Basics with Compose",
                subtitle = "Think about to Start learning Compose",
                content = "We released the first two units of Android Basics with Compose, our first free course that teaches Android Development with Jetpack Compose to anyone; you do not need any prior programming experience other than basic computer literacy to get started. You’ll learn the fundamentals of programming in Kotlin while building Android apps using Jetpack Compose, Android’s modern toolkit that simplifies and accelerates native UI development. These two units are just the beginning; more will be coming soon. Check out Android Basics with Compose to get started on your Android development journey",
                url = "https://android-developers.googleblog.com/2022/05/new-android-basics-with-compose-course.html",
                thumbnail = "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiv3CjuEunEpPuvrsKEV0f7R_OSPonuZnDUi97Hrz68T9xKpsUHRoFaivipPxNQ6QT3BIHVxtSH85xurEqxSnC1S7rQklKL8vKj40E2xgFWE9ylhjZDHbWoie3Evgl_WjnG2nQ1UxFVs9lg3IAMIv_CHCsuesUuCW_BMddUXU4JErFXLn9Twcy2tKKfHA/s1600/Android-JetpackCompose1.2-Header.png",
                favourite = false
            ),
            Article(
                id = "2",
                title = "One Million Subscriber",
                subtitle = "Thanks for helping us reach 1M Youtube Subscribers",
                content = "Thank you everyone for following the Now in Android series and everything the " +
                        "Android Developers YouTube channel has to offer. During the Android Developer " +
                        "Summit, our YouTube channel reached 1 million subscribers! Here’s a small video to " +
                        "thank you all.",
                url = "https://youtu.be/-fJ6poHQrjM",
                thumbnail = "https://eu-images.contentstack.com/v3/assets/blt66983808af36a8ef/bltf895b48259d85357/627043e9a2ba2e13583bde84/AndroidParty-Hennell-Alamy.jpg?quality=80&format=webply&width=690",
                favourite = false
            ),
            Article(
                id = "3",
                title = "The Paging Library",
                subtitle = "Transformations and customisations in the Paging Library",
                content = "A demonstration of different operations that can be performed " +
                        "with Paging. Transformations like inserting separators, when to " +
                        "create a new pager, and customisation options for consuming " +
                        "PagingData.",
                url = "https://youtu.be/ZARz0pjm5YM",
                thumbnail = "https://1.bp.blogspot.com/-5UNs5A0Mudc/X7wmcEcghkI/AAAAAAAAP34/bTWAFdunfkkyFA0Rq3hhDcpSAHTpEKTzwCLcBGAsYHQ/s0/0_0ur42X5UCno7L6M1.jpg",
                favourite = false
            ),
            Article(
                id = "4",
                title = "Android App Performance",
                subtitle = "Accurately Measure Android App Performance with Profileable Builds",
                content = "It’s important to stay on top of your app performance to make sure your users can easily " +
                        "use your app. When an app experiences issues such as animation jank, frozen frames, and high " +
                        "memory usage, it negatively impacts the user experience which could lead to lower ratings or app " +
                        "deletion. To fix these performance issues, we first need the right tools to measure app " +
                        "performance correctly.",
                url = "https://android-developers.googleblog.com/2022/10/accurately-measure-android-app-performance-with-profileable-builds.html",
                thumbnail = "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgJeUEbEv8na8t4GfhgfHjEFdbRARTtJbC1GCCflPKxB-XFKlpntvqp9X6LNgLKNgGNCaLvFSK6Ql4mA-JEGSZRNFgtz5AzDkeetxzsDWFZY4mK-zOPsCNi7OqT9q_Gyx-XrxNri6UaYSIL2DcbxGW-Qgi0K9rlRoRsN0TssyDz22ZMgnJCzd9WHATm/s1600/Android_AccuratelyMeasureAppPerformance_4209x1253.png",
                favourite = false
            ),

            Article(
                id = "5",
                title = "Growth with Play Commerce",
                subtitle = "Purchase optimization, flexible subscriptions, and revenue growth with Play Commerce",
                content = "Google Play Commerce provides buyer support in over 190 markets, extensive support for local payment methods, " +
                        "and monetization tools to increase buyer conversion, engagement, and retention – all built on our trusted and " +
                        "secure platform. This year, we’ve made improvements across our platform, with new purchase optimizations, more " +
                        "flexibility and control when selling subscriptions, and enhancements to monetization insights and programs aimed " +
                        "at boosting your revenue.",
                url = "https://android-developers.googleblog.com/2022/11/optimization-flexibility-and-growth-with-play-commerce.html",
                thumbnail = "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEguBPdsov8j7BCat7JbbsQYh7p75Tdm7yu-crtEA_ypQZQteC8QNt6DZ2l-AUoxdImroS_vBZU-2TDBDzhQMacnqEcRlfJ-foKdgggx8qykYAXc1t_WRuXMWjZKfgneRLURAQQgbp3TqtagI3EJ1EzI7WMb6gwQ6VQ5bzZdbklE9kPe-NbLgUtGBFvZ/s1600/image7.png",
                favourite = false
            ),

            Article(
                id = "6",
                title = "Another decade of developer success",
                subtitle = "Play it forward: Evolving our platform for another decade of developer success",
                content = "Google Play Commerce provides buyer support in over 190 markets, extensive support for local payment methods, " +
                        "and monetization tools to increase buyer conversion, engagement, and retention – all built on our trusted and " +
                        "secure platform. This year, we’ve made improvements across our platform, with new purchase optimizations, more " +
                        "flexibility and control when selling subscriptions, and enhancements to monetization insights and programs aimed " +
                        "at boosting your revenue.",
                url = "https://android-developers.googleblog.com/2022/11/play-it-forward.html",
                thumbnail = "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjaUj9Tkv27nYFksQC5IJu1-qBaOI8P6TR-Re6el9p5Mrnjjdiji7FJkNExfxgqM7agweediKhauFUE70SslJE-lqlLRg4QWQtrTmciDnRzqUzPW9v3Si0Cut9ChW6s1NGBVZ6muflMI6qKUiU88bzZInXwmU3HHeJnYvNSSzJzq3hqsTeCG3U0lkBE/s1600/Play-what_s-new-in-play-header.png",
                favourite = false
            ),
            Article(
                id = "7",
                title = "Technical quality on Google Play",
                subtitle = "Raising the bar on technical quality on Google Play",
                content = "App quality is the foundation of everything we do at Google Play. Android users expect a great experience " +
                        "from the apps and games they download, so we’re making higher-quality titles more visible on the Play Store, " +
                        "as well as steering users away from lower-quality ones. Some apps and games that don’t meet our quality bar " +
                        "will be excluded from prominent discovery surfaces such as recommendations, while others may display a warning " +
                        "on their store listing to set appropriate user expectations.",
                url = "https://android-developers.googleblog.com/2022/10/raising-bar-on-technical-quality-on-google-play.html",
                thumbnail = "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEia4TBaGx5Lrsr_g1R_DTyUmQ94hCEkaHINl1WXJdF--xl-hT6lWUhWT22z9iHRnMRTBxikOfZ3oW0vQT-cEVxARaoL13cdAEHRQYDECDkNs1BJ3XTeI7RVzfLpvg3-BMPJ4o3YbeuIcEsfFXk8OgzYlehq9xViMJcP4C0yVdp3FWXhshSDcC4wlPPb/s1600/Play-quality-header.png",
                favourite = false
            ),
            Article(
                id = "8",
                title = "Rewarding great Apps and Games",
                subtitle = "Supporting and rewarding great Apps and Games on Google Play",
                content = "At Google Play, our mission is to facilitate relationships between Android users and app and game developers, " +
                        "enabling tens of thousands of businesses worldwide to grow and thrive in the mobile ecosystem. Every day, " +
                        "together, we help billions of people discover engaging, helpful, and enriching experiences on their devices, " +
                        "which is why we care so deeply about the quality of the experience we offer on the Play Store.",
                url = "https://android-developers.googleblog.com/2022/11/supporting-and-rewarding-great-apps-and-games-on-google-play.html",
                thumbnail = "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjUhJw3xZBtvAP7eCAp3IIKxYTbpnq9_vT7ViFSLDQJ89U5skFRV7L80dGT2JfwD4XbT1GZ9vO7-DUx0zQFE4DB0wmbwGHRWM9qNJzf5RuyfvMoB-1GeU2eHneuWspP-X_UAv6mvKMhALmWkpyemYRpcFi-BcrRWIZMlEkdNVw4QABYs3yNFJksOF_i/s1600/Play-store-header.png",
                favourite = false
            )
        )
    }
}