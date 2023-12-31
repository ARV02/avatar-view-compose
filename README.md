## AvatarView

AvatarView is a component for jetpack compose where you can add an image or user name. 

<p align="center">
  <img src="https://github.com/ARV02/avatar-view-compose/assets/56147310/98bd5f13-43a0-41e6-b61b-d476e641674f" />
</p>

##
### Download

You can download a jar from GitHub's [releases page](https://github.com/ARV02/avatar-view-compose/releases).

For download add next to settings.gradle:

``` gradle
repositories {
  google()
  mavenCentral()
  maven { url 'https://jitpack.io' }
}

```

In your build.gradle(:app):

``` gradle
dependencies {
  implementation 'com.github.ARV02:avatar-view-compose:1.0.2'
}

```

or Maven: 

``` xml
<repositories>
  <repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
  </repository>
</repositories>

```

``` xml
<dependency>
  <groupId>com.github.ARV02</groupId>
  <artifactId>avatar-view-compose</artifactId>
  <version>1.0.2</version>
</dependency>

```
**Note:** Make sure your JDK is 18.

##
### How do I use Avatar View?

``` kotlin
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
        text = "AR",
        backgroundColor = Color.Magenta,
        borderColor = Color.Red,
        borderWidth = 2.dp
        borderColor = Color.Black)
    }
  }
}
```

