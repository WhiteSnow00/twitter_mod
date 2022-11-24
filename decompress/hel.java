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

public final class hel extends uc9
{
    public final View M0;
    public final View N0;
    public final LinearLayout O0;
    public final TweetStatView P0;
    public final TweetStatView Q0;
    public final UserImageView R0;
    public final zrb S0;
    public final TextView T0;
    public final TextView U0;
    public final TextView V0;
    public final View W0;
    public final UserLabelView X0;
    public final TextView Y0;
    public final RecyclerView Z0;
    public final TextView a1;
    public final Activity b1;
    public final ImageSpan c1;
    public final ImageSpan d1;
    public final xdl e1;
    public final sfv f1;
    public final gjl g1;
    
    public hel(final Activity b1, final zrm zrm, final LayoutInflater layoutInflater, final j4e<vdl> adapter, final lel lel) {
        super(layoutInflater, 2131624283, 0, 2131624116);
        this.b1 = b1;
        final View f0 = ((sl8)this).F0;
        this.M0 = f0.findViewById(2131430773);
        this.N0 = f0.findViewById(2131431743);
        this.Q0 = (TweetStatView)f0.findViewById(2131429241);
        final LinearLayout o0 = (LinearLayout)f0.findViewById(2131427978);
        this.O0 = o0;
        f0.findViewById(2131427982).setVisibility(8);
        this.P0 = (TweetStatView)f0.findViewById(2131429238);
        this.R0 = (UserImageView)f0.findViewById(2131430745);
        this.S0 = new zrb((SocialProofView)f0.findViewById(2131430768), (View$OnClickListener)null);
        this.T0 = (TextView)f0.findViewById(2131430191);
        this.U0 = (TextView)f0.findViewById(2131432492);
        this.V0 = (TextView)f0.findViewById(2131432462);
        this.W0 = f0.findViewById(2131432493);
        this.Y0 = (TextView)f0.findViewById(2131429243);
        this.X0 = (UserLabelView)f0.findViewById(2131432484);
        final RecyclerView recyclerView = (RecyclerView)f0.findViewById(2131429521);
        final f5e i0 = adapter.I0;
        final int a = o5j.a;
        this.e1 = (xdl)i0;
        recyclerView.setLayoutManager((RecyclerView$m)new FlowLayoutManager());
        recyclerView.setAdapter((RecyclerView$e)adapter);
        this.Z0 = (RecyclerView)f0.findViewById(2131430086);
        this.a1 = (TextView)f0.findViewById(2131430756);
        ((Context)b1).getResources();
        this.c1 = v0(zrm, ie9.a((Context)b1, 2130969754, 2131232212), b1b.B((Context)b1, 2130968593));
        this.d1 = v0(zrm, ie9.a((Context)b1, 2130969795, 2131232532), b1b.B((Context)b1, 2130969040));
        final View viewById = f0.findViewById(2131430730);
        if (viewById != null) {
            viewById.setBackgroundColor(b1b.B((Context)b1, 2130969036));
        }
        ((View)o0).setBackgroundColor(b1b.B((Context)b1, 2130969036));
        this.f1 = lel.l;
        this.g1 = lel.j;
    }
    
    public static void t0(final SpannableStringBuilder spannableStringBuilder, final ImageSpan imageSpan) {
        spannableStringBuilder.append((CharSequence)"\u202f");
        spannableStringBuilder.append((CharSequence)"\u202f");
        spannableStringBuilder.setSpan((Object)imageSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
    }
    
    public static ImageSpan v0(final zrm zrm, int n, final int n2) {
        final Drawable j = zrm.j(n);
        j.setColorFilter(n2, PorterDuff$Mode.SRC_ATOP);
        n = (int)zrm.b.getDimension(2131166932);
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
    
    public final void s0(final vdl vdl) {
        final xdl e1 = this.e1;
        final p4e b = ((fj8)e1).b;
        boolean b2 = false;
        Label_0060: {
            if (b != null) {
                final p4e$b p4e$b = new p4e$b(b);
                while (p4e$b.hasNext()) {
                    if (vdl.equals((Object)((ohz)p4e$b).next())) {
                        b2 = true;
                        break Label_0060;
                    }
                }
            }
            b2 = false;
        }
        if (!b2) {
            final ojf h = ojf.H();
            final p4e b3 = ((fj8)e1).b;
            if (b3 != null && !b3.isEmpty()) {
                h.q((Iterable)((fj8)e1).b);
            }
            h.p((Object)vdl);
            ((fj8)e1).d((p4e)new zkf((Iterable)((z4j)h).e()));
        }
    }
    
    public final void x0(final int n) {
        this.M0.setVisibility(n);
        this.N0.setVisibility(n);
    }
}
