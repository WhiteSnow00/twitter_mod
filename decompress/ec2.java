import android.view.View;
import android.view.View$OnClickListener;
import android.widget.TextView;
import android.view.ViewGroup;
import com.twitter.util.user.UserIdentifier;
import android.content.Intent;
import android.view.LayoutInflater;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ec2
{
    public final Activity a;
    public final pb2 b;
    public final mb2 c;
    public final obi<?> d;
    public final xb2 e;
    public final fc2 f;
    public final vb2 g;
    public final long h;
    public final long i;
    
    public ec2(final LayoutInflater layoutInflater, final Intent intent, final Activity a, final gc2 gc2, final fc2 f, final UserIdentifier userIdentifier, final obi<?> d, final jkb jkb) {
        final long longExtra = intent.getLongExtra("card_id", -1L);
        final long longExtra2 = intent.getLongExtra("status_id", -1L);
        final pb2 b = (pb2)klp.a(intent.getByteArrayExtra("brand_survey_provider"), (rlp)pb2.e);
        jee.l((Object)b);
        final mb2 c = (mb2)klp.a(intent.getByteArrayExtra("brand_survey_answers"), (rlp)mb2.d);
        jee.l((Object)c);
        final int intExtra = intent.getIntExtra("brand_survey_question_index", -1);
        final View inflate = layoutInflater.inflate(2131624121, (ViewGroup)null, false);
        final xb2 e = new xb2(layoutInflater, inflate.getResources(), inflate, (TextView)inflate.findViewById(2131430844), (TextView)inflate.findViewById(2131430843), (ViewGroup)inflate.findViewById(2131428230), inflate.findViewById(2131430242), inflate.findViewById(2131428785), inflate.findViewById(2131428264), jkb);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.h = longExtra;
        this.i = longExtra2;
        this.g = new vb2((long)longExtra, (long)longExtra2, dk3.e(userIdentifier), (dk3$a)null);
        e.O0.setOnClickListener((View$OnClickListener)new m0x((Object)a, 4));
        ((jc2)e).K0.setOnClickListener((View$OnClickListener)new cc2((Object)this, (Object)gc2, (Object)b, 0));
        final int size = b.a.size();
        if (size > intExtra) {
            f.a("survey_full_page", b.b, intExtra);
            final yb2 yb2 = b.a.get(intExtra);
            jee.l((Object)yb2);
            ((jc2)e).G0.setText((CharSequence)yb2.a);
            ((jc2)e).i(intExtra + 1, size);
            ((jc2)e).h(yb2);
            boolean b2 = true;
            if (intExtra != size - 1) {
                b2 = false;
            }
            if (!b2) {
                ((jc2)e).J0.setVisibility(0);
                ((jc2)e).K0.setVisibility(8);
                ((jc2)e).J0.setOnClickListener((View$OnClickListener)new dc2((Object)this, intExtra, 0));
            }
            else {
                ((jc2)e).K0.setVisibility(0);
                ((jc2)e).J0.setVisibility(8);
            }
        }
        else {
            a.finish();
        }
    }
}
