@RestController
class HelloWorld {
  // This Is first Method
  @RequestMapping("/")
  String hello() {
    "Hello JournalDev World."
  }

}