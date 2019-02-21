package com.example.administrator.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableStringBuilder;

import com.mukesh.MarkdownView;
import com.overzealous.remark.Remark;

public class MainActivity extends AppCompatActivity {
    private MarkdownView markdown_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        markdown_view = findViewById(R.id.markdown_view);
        new Thread(new Runnable() {
            @Override
            public void run() {
                Remark remark = new Remark();
                String input = "<div data-note-content=\"\" class=\"show-content\">\n" +
                        "          <div class=\"show-content-free\">\n" +
                        "            <h3>一、概述</h3>\n" +
                        "<p><strong>Monitor</strong> 是我刚开发完成的一个开源项目，适用于使用了 OkHttp 作为网络请求框架的项目，可以拦截并缓存应用内的所有 Http 请求和响应信息，且可以以 Notification 和 Activity 的形式来展示具体内容</p>\n" +
                        "<div class=\"image-package\">\n" +
                        "<div class=\"image-container\" style=\"max-width: 500px; max-height: 1244px; background-color: transparent;\">\n" +
                        "<div class=\"image-container-fill\" style=\"padding-bottom: 177.8%;\"></div>\n" +
                        "<div class=\"image-view\" data-width=\"500\" data-height=\"889\"><img data-original-src=\"https://upload-images.jianshu.io/upload_images/14621973-4b22d1d85274200a.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1000/format/webp\" data-original-width=\"500\" data-original-height=\"889\" data-original-format=\"image/gif\" data-original-filesize=\"3671283\" class=\"\" style=\"cursor: zoom-in;\" src=\"https://upload-images.jianshu.io/upload_images/2552605-590161bfc9f353d2.gif?imageMogr2/auto-orient/strip%7CimageView2/2/w/500/format/webp\"></div>\n" +
                        "</div>\n" +
                        "<div class=\"image-caption\"></div>\n" +
                        "</div>\n" +
                        "<div class=\"image-package\">\n" +
                        "<div class=\"image-container\" style=\"max-width: 500px; max-height: 1244px; background-color: transparent;\">\n" +
                        "<div class=\"image-container-fill\" style=\"padding-bottom: 177.8%;\"></div>\n" +
                        "<div class=\"image-view\" data-width=\"500\" data-height=\"889\"><img data-original-src=\"https//upload-images.jianshu.io/upload_images/2552605-043084a61be063fb.gif\" data-original-width=\"500\" data-original-height=\"889\" data-original-format=\"image/gif\" data-original-filesize=\"3258717\" class=\"\" style=\"cursor: zoom-in;\" src=\"//upload-images.jianshu.io/upload_images/2552605-043084a61be063fb.gif?imageMogr2/auto-orient/strip%7CimageView2/2/w/500/format/webp\"></div>\n" +
                        "</div>\n" +
                        "<div class=\"image-caption\"></div>\n" +
                        "</div>\n" +
                        "<h3>二、使用</h3>\n" +
                        "<p>项目主页：<a href=\"https://github.com/leavesC/Monitor\" target=\"_blank\" rel=\"nofollow\">Android OkHttp 网络请求调试利器 - Monitor</a></p>\n" +
                        "<p>Apk下载：<a href=\"https://www.pgyer.com/leavesC_Monitor\" target=\"_blank\" rel=\"nofollow\">Android OkHttp 网络请求调试利器 - Monitor</a></p>\n" +
                        "<p>在 <strong>build.gradle</strong> 文件中添加依赖：</p>\n" +
                        "<pre class=\"hljs bash\"><code class=\"bash\">    implementation <span class=\"hljs-string\">'leavesc.hello:Monitor:1.0.3'</span>\n" +
                        "</code></pre>\n" +
                        "<p>添加 <strong>MonitorInterceptor</strong> 作为项目中 <strong>OkHttpClient</strong> 的拦截器</p>\n" +
                        "<pre class=\"hljs cpp\"><code class=\"cpp\">    OkHttpClient okHttpClient = <span class=\"hljs-keyword\">new</span> OkHttpClient.Builder()\n" +
                        "            .addInterceptor(<span class=\"hljs-keyword\">new</span> MonitorInterceptor(<span class=\"hljs-keyword\">this</span>)).build();\n" +
                        "</code></pre>\n" +
                        "<p><strong>然后？没了，OK了</strong></p>\n" +
                        "<p>是的，就是这么简单，只要添加了 <strong>MonitorInterceptor</strong> 拦截器，之后 <strong>Monitor</strong> 就会自动记录下所有 <strong>Http 请求的请求信息以及响应体</strong>，且自动弹窗提示。当然，为了照顾到其他一些特殊情况，<strong>Monitor</strong> 也对外提供了一些方便访问的 Api</p>\n" +
                        "<p><strong>注意：以下方法需要在实例化 MonitorInterceptor 后再调用，否则会抛出异常</strong></p>\n" +
                        "<p><strong>1. 启动 Http 列表页</strong></p>\n" +
                        "<pre class=\"hljs css\"><code class=\"css\">    <span class=\"hljs-selector-tag\">startActivity</span>(<span class=\"hljs-selector-tag\">Monitor</span><span class=\"hljs-selector-class\">.getLaunchIntent</span>(<span class=\"hljs-selector-tag\">MainActivity</span><span class=\"hljs-selector-class\">.this</span>));\n" +
                        "</code></pre>\n" +
                        "<p><strong>2. 开启弹窗</strong></p>\n" +
                        "<pre class=\"hljs bash\"><code class=\"bash\">    Monitor.showNotification(<span class=\"hljs-literal\">true</span>);\n" +
                        "</code></pre>\n" +
                        "<p><strong>3. 关闭弹窗（当有新数据时也不会显示）</strong></p>\n" +
                        "<pre class=\"hljs bash\"><code class=\"bash\">    Monitor.showNotification(<span class=\"hljs-literal\">false</span>);\n" +
                        "</code></pre>\n" +
                        "<p><strong>4. 清除弹窗（当有新数据时会再次显示）</strong></p>\n" +
                        "<pre class=\"hljs css\"><code class=\"css\">    <span class=\"hljs-selector-tag\">Monitor</span><span class=\"hljs-selector-class\">.clearNotification</span>();\n" +
                        "</code></pre>\n" +
                        "<p><strong>5. 清除缓存</strong></p>\n" +
                        "<pre class=\"hljs css\"><code class=\"css\">    <span class=\"hljs-selector-tag\">Monitor</span><span class=\"hljs-selector-class\">.clearNotification</span>();\n" +
                        "</code></pre>\n" +
                        "<p><strong>6. 监听 Http 数据变化</strong></p>\n" +
                        "<pre class=\"hljs java\"><code class=\"java\">        <span class=\"hljs-comment\">//参数用于监听最新指定条数的数据变化，如果不传递参数则会监听所有的数据变化</span>\n" +
                        "        Monitor.queryAllRecord(<span class=\"hljs-number\">10</span>).observe(<span class=\"hljs-keyword\">this</span>, <span class=\"hljs-keyword\">new</span> Observer&lt;List&lt;HttpInformation&gt;&gt;() {\n" +
                        "            <span class=\"hljs-meta\">@Override</span>\n" +
                        "            <span class=\"hljs-function\"><span class=\"hljs-keyword\">public</span> <span class=\"hljs-keyword\">void</span> <span class=\"hljs-title\">onChanged</span><span class=\"hljs-params\">(@Nullable List&lt;HttpInformation&gt; httpInformationList)</span> </span>{\n" +
                        "                tv_log.setText(<span class=\"hljs-keyword\">null</span>);\n" +
                        "                <span class=\"hljs-keyword\">if</span> (httpInformationList != <span class=\"hljs-keyword\">null</span>) {\n" +
                        "                    <span class=\"hljs-keyword\">for</span> (HttpInformation httpInformation : httpInformationList) {\n" +
                        "                        tv_log.append(httpInformation.toString());\n" +
                        "                        tv_log.append(<span class=\"hljs-string\">\"\\n\\n\"</span>);\n" +
                        "                        tv_log.append(<span class=\"hljs-string\">\"*************************************\"</span>);\n" +
                        "                        tv_log.append(<span class=\"hljs-string\">\"\\n\\n\"</span>);\n" +
                        "                    }\n" +
                        "                }\n" +
                        "            }\n" +
                        "        });\n" +
                        "</code></pre>\n" +
                        "<h3>三、致谢</h3>\n" +
                        "<p>Monitor 的一部分灵感来源于另一个开源项目：<a href=\"https://github.com/jgilfelt/chuck\" target=\"_blank\" rel=\"nofollow\">Chuck</a>，因此你可以看到两个项目的 UI 基本是相同的，因为我觉得 UI 是次要的，也懒得去想新的交互方式，我借鉴的主要是其拦截器的数据抓取思路。而因为我对 Chuck 有些地方不太满意，包括<strong>Notification 无法动态精确控制、无法通过 API 清除缓存、无法监听数据变化</strong>等，所以才打算自己来实现</p>\n" +
                        "<p>此外，Monitor 使用到的依赖还包括：</p>\n" +
                        "<pre class=\"hljs bash\"><code class=\"bash\">    implementation <span class=\"hljs-string\">\"com.squareup.okhttp3:okhttp:3.12.0\"</span>\n" +
                        "    implementation <span class=\"hljs-string\">'com.google.code.gson:gson:2.8.5'</span>\n" +
                        "    implementation <span class=\"hljs-string\">'android.arch.persistence.room:runtime:1.1.1'</span>\n" +
                        "    annotationProcessor <span class=\"hljs-string\">'android.arch.persistence.room:compiler:1.1.1'</span>\n" +
                        "    implementation <span class=\"hljs-string\">'android.arch.lifecycle:extensions:1.1.1'</span>\n" +
                        "</code></pre>\n" +
                        "<p>当中，okhttp 和 gson 不必说，room 和 lifecycle 都是 Google Jetpack 组件的一部分，room 和 lifecycle 搭配使用真的还是蛮爽的~~</p>\n" +
                        "<h3>四、结束语</h3>\n" +
                        "<p>项目主页：<a href=\"https://github.com/leavesC/Monitor\" target=\"_blank\" rel=\"nofollow\">Android OkHttp 网络请求调试利器 - Monitor</a></p>\n" +
                        "<p>Apk下载：<a href=\"https://www.pgyer.com/leavesC_Monitor\" target=\"_blank\" rel=\"nofollow\">Android OkHttp 网络请求调试利器 - Monitor</a></p>\n" +
                        "<p>欢迎 star</p>\n" +
                        "\n" +
                        "          </div>\n" +
                        "        </div>";
                input = input.replace("src=\"//", "src=\"https://");
                final SpannableStringBuilder spannableString = new SpannableStringBuilder("");
                try {
                    spannableString.append(remark.convertFragment(input));
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            markdown_view.setMarkDownText(spannableString.toString());
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
