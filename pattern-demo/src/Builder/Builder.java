package Builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kyle.Wang
 * 2018-03-17 23:17
 */
public class Builder {

    private List<Sender> list = new ArrayList<>();

    public void produceMailSender(int count){
        for (int i = 0; i < count; i++) {
            list.add(new MailSender());
        }
    }
    public void produceSmsSender(int count){
        for (int i = 0; i < count; i++) {
            list.add(new SmsSender());
        }
    }
}
