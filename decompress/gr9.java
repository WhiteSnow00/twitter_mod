import android.os.Bundle;
import com.twitter.navigation.timeline.EditHistoryContentViewArgs;
import android.content.res.Resources;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gr9 extends b6c
{
    public gr9(final Intent intent) {
        super(intent);
    }
    
    public gr9(final String s, final Resources resources, final String s2, final String s3) {
        czd.f((Object)resources, "resources");
        final Intent intent = new Intent();
        final g7c$a g7c$a = new g7c$a();
        g7c$a.a = "edit_history_timeline";
        g7c$a.b = new f7c(new String[] { "tweet_result", "result", "edit_history_timeline", "timeline" });
        ((qjg)g7c$a.c).w((Object)"rest_id", (Object)s);
        ((qjg)g7c$a.c).w((Object)"includeTweetVisibilityNudge", (Object)xa8.p());
        dwj.c(intent, "arg_graphql_timeline_info", (Object)((n4j)g7c$a).e(), (rlp)g7c.e);
        intent.putExtra("arg_title", (CharSequence)resources.getString(2131953716));
        super(intent);
        final EditHistoryContentViewArgs editHistoryContentViewArgs = new EditHistoryContentViewArgs(s2, s3);
        final Intent mIntent = ((xi1)this).mIntent;
        final Bundle c = rm6.c(editHistoryContentViewArgs);
        czd.c((Object)c);
        mIntent.putExtras(c);
    }
}
