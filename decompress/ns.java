import com.twitter.media.ui.image.c;
import android.os.BaseBundle;
import androidx.fragment.app.Fragment;
import android.view.View;
import android.content.Context;
import android.content.res.Resources;
import android.widget.ImageView$ScaleType;
import com.twitter.media.ui.fresco.FrescoMediaImageView;
import android.text.style.ForegroundColorSpan;
import android.view.View$OnClickListener;
import android.app.Activity;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import android.os.Bundle;
import android.app.Dialog;

// 
// Decompiled by Procyon v0.6.0
// 

public class ns extends qas
{
    public final /* bridge */ xk1 h2() {
        return (xk1)this.z2();
    }
    
    public final /* bridge */ o8q m2() {
        return (o8q)this.z2();
    }
    
    public final void n2(final Dialog dialog, final Bundle bundle) {
        super.n2(dialog, bundle);
        final TextView textView = (TextView)((wk1)this).g2(2131428666);
        jee.l((Object)textView);
        final os z2 = this.z2();
        final cnb l0 = ((Fragment)this).L0();
        final String string = ((BaseBundle)((vl1)z2).a).getString("scribe_page");
        jee.l((Object)string);
        final Resources resources = ((Context)l0).getResources();
        ((View)textView).setContentDescription((CharSequence)resources.getString(2131951890));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        ((View)textView).setOnClickListener((View$OnClickListener)new a1g(string, (Activity)l0, resources));
        final Context n0 = ((Fragment)this).N0();
        textView.setText((CharSequence)uoz.D(new Object[] { new ForegroundColorSpan(d4j.i(n0, 2130968591)) }, n0.getResources().getString(2131951889), "{{}}"));
        final pdj pdj = (pdj)klp.a((byte[])(Object)((vl1)z2).a.getSerializable("header_image"), (rlp)pdj.c);
        final View g2 = ((wk1)this).g2(2131429415);
        final int a = c5j.a;
        final FrescoMediaImageView frescoMediaImageView = (FrescoMediaImageView)g2;
        if (pdj != null && frescoMediaImageView != null) {
            ((View)frescoMediaImageView).setVisibility(0);
            final odj a2 = pdj.a;
            final z6d a3 = a2.a;
            if (a3 != null) {
                ((c)frescoMediaImageView).p(y7d.d(a3.D0, a3.E0, (k6w)null));
            }
            else if (ikr.g((CharSequence)a2.b) && pdj.a.b.equals("AddressBookPlaceholder")) {
                ((c)frescoMediaImageView).setDefaultDrawable(krm.a((Activity)((Fragment)this).L0()).j(2131232166));
                ((c)frescoMediaImageView).setDefaultDrawableScaleType(ImageView$ScaleType.FIT_CENTER);
            }
        }
    }
    
    public final /* bridge */ ras t2() {
        return this.z2();
    }
    
    public final os z2() {
        return new os(((Fragment)this).J0);
    }
}
