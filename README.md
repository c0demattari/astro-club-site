# このリポジトリについて

名古屋工業大学プログラミング部 C0de のウェブサイトです。
静的サイトジェネレータの Astro を用いて作られています。

# 開発サーバーの起動方法

```
npm run dev
```

# ビルド方法

```
npm run build
```

# Plesk へのデプロイ方法

1. 大学の VPN に接続
2. [Plesk](https://plesk4.club.nitech.ac.jp:8443/login_up.php) にログイン
3. ダッシュボードから「ファイル」に移動
   - ![Dashboard](https://raw.githubusercontent.com/c0demattari/astro-club-site/refs/heads/main/docs/plesk-dashboard.png)
4. `npm run build` でビルドした生成物をアップロード
   - ![File](https://raw.githubusercontent.com/c0demattari/astro-club-site/refs/heads/main/docs/plesk-file.png)

> [!TIP]
> 現状 `/httpdocs/dist` にアップロードされたページが公開される。
> これを変更したい場合、ダッシュボードの「ホスティングと DNS」から「ホスティング」をクリックし、ドキュメントルートのパスを変更すればよい。

![Hosting](https://raw.githubusercontent.com/c0demattari/astro-club-site/refs/heads/main/docs/plesk-hosting.png)
![Host Settings](https://raw.githubusercontent.com/c0demattari/astro-club-site/refs/heads/main/docs/plesk-host-settings.png)
