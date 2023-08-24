## AvatarView

AvatarView is a component for jetpack compose where you can add an image or user holder. 

<p align="center">
  <img src="https://github.com/ARV02/avatar-view-compose/assets/56147310/98bd5f13-43a0-41e6-b61b-d476e641674f" />
</p>

##
### Download

You can download a jar from GitHub's [releases page](https://github.com/ARV02/avatar-view-compose/releases).

For download add next to settings.gradle:

```
repositories {
  google()
  mavenCentral()
  maven { url 'https://jitpack.io' }
}

```

In yout build.gradle(:app):

```
dependencies {
  implementation 'com.github.ARV02:avatar-view-compose:1.0.0'
}

```

or Maven: 

```
<repositories>
  <repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
  </repository>
</repositories>

```

```
<dependency>
  <groupId>com.github.ARV02</groupId>
  <artifactId>avatar-view-compose</artifactId>
  <version>1.0.0</version>
</dependency>

```
**Note:** Make sure your JDK is 17.

##
### How do I use Avatar View?

```
@Composable
fun Screen() {
  ComposeTheme {
    Column(
      modifier = Modifier.fillMaxSize(),
      verticalArrangement = Arrangement.Center,
      horizontalAlignment = Alignment.CenterHorizontally
  ){
    //Import AvatarView
    AvatarView(
        text = "AR"
        color = Color.White,
        borderColor = Color.Black)
    }
  }
}
```

