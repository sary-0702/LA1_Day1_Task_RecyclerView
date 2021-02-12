package app.nunome.sary.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val courseData: List<CourseData> = listOf(
            CourseData(R.drawable.android, "Androidアプリプログラミングコース", "色んなアプリを作って、プログラミングを楽しもう！"),
            CourseData(R.drawable.iphone, "iPhoneアプリプログラミングコース", "世界にひとつだけのiPhoneアプリをつくって、周りを驚かせよう！"),
            CourseData(R.drawable.unity, "Unityゲームプログラミングコース", "世界を動かすワクワクが止まらない！3Dゲームを制作しよう！"),
            CourseData(R.drawable.minecraft, "Minecraftプログラミングコース", "マインクラフトでJavaプログラミングを学ぼう！"),
            CourseData(R.drawable.movie, "映像制作コース", "撮影から編集まで、オリジナルの映像制作を作り出そう！"),
            CourseData(R.drawable.animation, "アニメーションコース", "世界にひとつだけのiPhoneアプリをつくって、周りを驚かせよう！"),
            CourseData(R.drawable.maya, "Maya 3DCGコース", "世界にひとつだけのiPhoneアプリをつくって、周りを驚かせよう！"),
            CourseData(R.drawable.camera, "カメラ＆フォトグラフィーコース", "みんなに一目置かれる写真作品を作れるようになろう！"),
            CourseData(R.drawable.media_art, "メディアアートプログラミングコース", "映像とプログラミングの融合！メディアアートの世界へ！"),
            CourseData(R.drawable.designer, "デザイナーコース", "思い描いたイメージをカタチに出来る、一生使える力を身につけよう！"),
            CourseData(R.drawable.web_design, "Webデザインコース", "HTML5, CSS3, JavaScriptで動くオリジナルWebサイトを作ろう！"),
            CourseData(R.drawable.web_service, "Webサービスプログラミングコース", "インターネットの仕組みを学び、Webサービスをリリースしよう！"),
            CourseData(R.drawable.digital_music, "デジタルミュージックコース", "今日から君はミュージシャン！その直感を音楽に変えよう！"),
            CourseData(R.drawable.miku, "初音ミク　V3コース", "初音ミクにメロディを歌わせよう！")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = RecyclerViewAdapter(this)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        adapter.addAll(courseData)
    }
}