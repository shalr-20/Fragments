# Fragments
A Fragment in Android is a small, reusable part of an app's user interface. Think of it as a "mini-screen" that can be combined with other fragments to create a full activity or screen. Fragments are useful when you want to:

 - Use multiple sections on the same screen (like tabs or split views).
 - Make your app work well on different devices, like phones and tablets, by reusing UI components.

## Key Features of a Fragment:

 - It lives inside an Activity (it cannot exist on its own).
 - It can have its own layout and logic, separate from the activity.
 - Multiple fragments can exist in one activity, and you can switch them dynamically.

### In this activity, there are two buttons. When you click:

 - Button 1: The first fragment is displayed.
 - Button 2: The second fragment is displayed.
 - This is done by dynamically replacing the fragment inside a container in the activity. Each button triggers a fragment transaction to load the corresponding fragment into the screen.

