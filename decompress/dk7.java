import android.os.Parcelable;
import android.content.Intent;
import com.twitter.app.dm.cards.dmfeedbackcard.FeedbackEnterCommentActivity;
import android.content.Context;
import com.twitter.app.dm.DMConversationContentViewProvider;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dk7 implements fo7
{
    public final /* synthetic */ DMConversationContentViewProvider a;
    
    public dk7(final DMConversationContentViewProvider a) {
        this.a = a;
    }
    
    public final void a(final hwa hwa) {
        final t9j<s09> t2 = this.a.T2;
        final Context r0 = this.a.r0();
        final DMConversationContentViewProvider a = this.a;
        t2.d((kmm)new s09(r0, a.F0, hwa, a.I2));
    }
    
    public final void b(final hwa hwa, final int o1) {
        final t9j<llr> s2 = this.a.S2;
        final Context r0 = this.a.r0();
        final DMConversationContentViewProvider a = this.a;
        final llr llr = new llr(r0, a.F0, hwa, a.I2);
        llr.o1 = o1;
        s2.d((kmm)llr);
    }
    
    public final void c(final hwa hwa, final String s, final String s2, final String s3) {
        this.a.r0().startActivity(new Intent(this.a.r0(), (Class)FeedbackEnterCommentActivity.class).putExtra("feedback_associated_user_name_key", s).putExtra("feedback_associated_score_description_key", s2).putExtra("feedback_request_params", (Parcelable)hwa).putExtra("feedback_scribe_component", s3));
    }
}
