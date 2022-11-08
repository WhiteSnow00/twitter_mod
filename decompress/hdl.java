import android.graphics.drawable.Drawable;
import android.graphics.PorterDuff$Mode;
import android.text.SpannableStringBuilder;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$e;
import androidx.recyclerview.widget.RecyclerView$m;
import com.twitter.ui.recyclerview.FlowLayoutManager;
import android.view.View$OnClickListener;
import com.twitter.ui.socialproof.SocialProofView;
import android.view.LayoutInflater;
import android.text.style.ImageSpan;
import android.app.Activity;
import androidx.recyclerview.widget.RecyclerView;
import com.twitter.ui.user.UserLabelView;
import android.widget.TextView;
import com.twitter.media.ui.image.UserImageView;
import com.twitter.ui.tweet.TweetStatView;
import android.widget.LinearLayout;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hdl extends jc9
{
    public final View J0;
    public final View K0;
    public final LinearLayout L0;
    public final TweetStatView M0;
    public final TweetStatView N0;
    public final UserImageView O0;
    public final zrb P0;
    public final TextView Q0;
    public final TextView R0;
    public final TextView S0;
    public final View T0;
    public final UserLabelView U0;
    public final TextView V0;
    public final RecyclerView W0;
    public final TextView X0;
    public final Activity Y0;
    public final ImageSpan Z0;
    public final ImageSpan a1;
    public final xcl b1;
    public final jev c1;
    public final hil d1;
    
    public hdl(final Activity y0, final tqm tqm, final LayoutInflater layoutInflater, final c4e<vcl> adapter, final ldl ldl) {
        super(layoutInflater, 2131624283, 0, 2131624116);
        this.Y0 = y0;
        final View c0 = ((el8)this).C0;
        this.J0 = c0.findViewById(2131430770);
        this.K0 = c0.findViewById(2131431739);
        this.N0 = (TweetStatView)c0.findViewById(2131429241);
        final LinearLayout l0 = (LinearLayout)c0.findViewById(2131427978);
        this.L0 = l0;
        c0.findViewById(2131427982).setVisibility(8);
        this.M0 = (TweetStatView)c0.findViewById(2131429238);
        this.O0 = (UserImageView)c0.findViewById(2131430742);
        this.P0 = new zrb((SocialProofView)c0.findViewById(2131430765), (View$OnClickListener)null);
        this.Q0 = (TextView)c0.findViewById(2131430188);
        this.R0 = (TextView)c0.findViewById(2131432488);
        this.S0 = (TextView)c0.findViewById(2131432458);
        this.T0 = c0.findViewById(2131432489);
        this.V0 = (TextView)c0.findViewById(2131429243);
        this.U0 = (UserLabelView)c0.findViewById(2131432480);
        final RecyclerView recyclerView = (RecyclerView)c0.findViewById(2131429520);
        final y4e f0 = adapter.F0;
        final int a = w4j.a;
        this.b1 = (xcl)f0;
        recyclerView.setLayoutManager((RecyclerView$m)new FlowLayoutManager());
        recyclerView.setAdapter((RecyclerView$e)adapter);
        this.W0 = (RecyclerView)c0.findViewById(2131430083);
        this.X0 = (TextView)c0.findViewById(2131430753);
        ((Context)y0).getResources();
        this.Z0 = v0(tqm, xd9.a((Context)y0, 2130969754, 2131232212), goz.J((Context)y0, 2130968593));
        this.a1 = v0(tqm, xd9.a((Context)y0, 2130969795, 2131232530), goz.J((Context)y0, 2130969040));
        final View viewById = c0.findViewById(2131430727);
        if (viewById != null) {
            viewById.setBackgroundColor(goz.J((Context)y0, 2130969036));
        }
        ((View)l0).setBackgroundColor(goz.J((Context)y0, 2130969036));
        this.c1 = ldl.l;
        this.d1 = ldl.j;
    }
    
    public static void t0(final SpannableStringBuilder spannableStringBuilder, final ImageSpan imageSpan) {
        spannableStringBuilder.append((CharSequence)"\u202f");
        spannableStringBuilder.append((CharSequence)"\u202f");
        spannableStringBuilder.setSpan((Object)imageSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
    }
    
    public static ImageSpan v0(final tqm tqm, int n, final int n2) {
        final Drawable j = tqm.j(n);
        j.setColorFilter(n2, PorterDuff$Mode.SRC_ATOP);
        n = (int)tqm.b.getDimension(2131166932);
        j.setBounds(0, 0, n, n);
        return new ImageSpan(j, 1);
    }
    
    public static void w0(final SpannableStringBuilder spannableStringBuilder, final ImageSpan imageSpan) {
        final int length = spannableStringBuilder.length();
        int i = 0;
        for (ImageSpan[] array = (ImageSpan[])spannableStringBuilder.getSpans(0, length, (Class)ImageSpan.class); i < array.length; ++i) {
            final ImageSpan imageSpan2 = array[i];
            if (imageSpan2.equals(imageSpan)) {
                final int spanStart = spannableStringBuilder.getSpanStart((Object)imageSpan2);
                spannableStringBuilder.delete(spanStart - 1, spanStart);
                spannableStringBuilder.removeSpan((Object)imageSpan2);
            }
        }
    }
    
    public final void s0(final vcl vcl) {
        final xcl b1 = this.b1;
        final i4e b2 = ((ri8)b1).b;
        boolean b3 = false;
        Label_0056: {
            if (b2 != null) {
                final i4e$b i4e$b = new i4e$b(b2);
                while (i4e$b.hasNext()) {
                    if (vcl.equals((Object)((bgz)i4e$b).next())) {
                        b3 = true;
                        break Label_0056;
                    }
                }
            }
            b3 = false;
        }
        if (!b3) {
            final ijf h = ijf.H();
            final i4e b4 = ((ri8)b1).b;
            if (b4 != null && !b4.isEmpty()) {
                h.q((Iterable)((ri8)b1).b);
            }
            h.p((Object)vcl);
            ((ri8)b1).d((i4e)new skf((Iterable)((h4j)h).e()));
        }
    }
    
    public final void x0(final int n) {
        this.J0.setVisibility(n);
        this.K0.setVisibility(n);
    }
}
