public class Main {
    public static void main(String[] args) {

//        EmailLogger Logger = new EmailLogger();
//        Logger.Log("Log Mesajı");
//        BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger() ,new DatabaseLogger() ,new ConsoleLogger()};
//        for(BaseLogger logger:loggers){
//
//            logger.Log("Log Mesajı");
//
//
//        }


        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();


    }
}