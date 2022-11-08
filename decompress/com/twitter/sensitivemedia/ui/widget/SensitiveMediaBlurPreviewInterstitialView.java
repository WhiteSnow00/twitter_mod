// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sensitivemedia.ui.widget;

import com.facebook.imagepipeline.request.a;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import com.twitter.media.ui.image.TweetMediaView$c;
import java.util.Locale;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.ui.components.button.legacy.TwitterButton;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import android.view.View$OnClickListener;
import androidx.constraintlayout.widget.ConstraintLayout;

@Metadata(bv = {}, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0014\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012" }, d2 = { "Lcom/twitter/sensitivemedia/ui/widget/SensitiveMediaBlurPreviewInterstitialView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "Landroid/view/View$OnClickListener;", "", "clickable", "Loyv;", "setClickable", "", "Ljhp;", "categories", "setSensitiveCategories", "Lcom/twitter/ui/components/button/legacy/TwitterButton;", "X0", "Lcom/twitter/ui/components/button/legacy/TwitterButton;", "getShowMediaView", "()Lcom/twitter/ui/components/button/legacy/TwitterButton;", "showMediaView", "subsystem.tfa.sensitivemedia.ui_release" }, k = 1, mv = { 1, 7, 1 })
public final class SensitiveMediaBlurPreviewInterstitialView extends ConstraintLayout implements View$OnClickListener
{
    public final SimpleDraweeView U0;
    public final TextView V0;
    public final TextView W0;
    public final TwitterButton X0;
    
    public SensitiveMediaBlurPreviewInterstitialView(final Context context, final AttributeSet set) {
        zzd.f((Object)context, "context");
        super(context, set, 0);
        LayoutInflater.from(context).inflate(2131625647, (ViewGroup)this, true);
        final View viewById = ((View)this).findViewById(2131431353);
        zzd.e((Object)viewById, "findViewById(R.id.sensitive_media_image)");
        this.U0 = (SimpleDraweeView)viewById;
        final View viewById2 = ((View)this).findViewById(2131431358);
        zzd.e((Object)viewById2, "findViewById(R.id.sensitive_media_title)");
        this.V0 = (TextView)viewById2;
        final View viewById3 = ((View)this).findViewById(2131431355);
        zzd.e((Object)viewById3, "findViewById(R.id.sensitive_media_message)");
        this.W0 = (TextView)viewById3;
        final View viewById4 = ((View)this).findViewById(2131429957);
        zzd.e((Object)viewById4, "findViewById(R.id.media_display)");
        this.X0 = (TwitterButton)viewById4;
    }
    
    public TwitterButton getShowMediaView() {
        return this.X0;
    }
    
    public final void onClick(final View view) {
        zzd.f((Object)view, "view");
        view.getId();
    }
    
    public void setClickable(final boolean clickable) {
        super.setClickable(clickable);
        ((View)this.U0).setClickable(clickable);
        ((View)this.V0).setClickable(clickable);
        ((View)this.W0).setClickable(clickable);
        ((View)this.getShowMediaView()).setClickable(clickable);
    }
    
    public final void setSensitiveCategories(final Set<? extends jhp> set) {
        zzd.f((Object)set, "categories");
        final List f2 = or4.f2((Iterable)set, (Comparator)new SensitiveMediaBlurPreviewInterstitialView$a());
        final ArrayList list = new ArrayList<Integer>(kr4.h1((Iterable)f2, 10));
        final Iterator iterator = f2.iterator();
        while (iterator.hasNext()) {
            final int ordinal = ((Enum)iterator.next()).ordinal();
            int n;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    n = 2131957574;
                }
                else {
                    n = 2131957573;
                }
            }
            else {
                n = 2131957572;
            }
            list.add(n);
        }
        final Context context = ((View)this).getContext();
        zzd.e((Object)context, "context");
        final ArrayList list2 = new ArrayList<String>(kr4.h1((Iterable)list, 10));
        final Iterator<Integer> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            list2.add(context.getString(iterator2.next().intValue()));
        }
        final String string = ((View)this).getContext().getString(2131957583);
        zzd.e((Object)string, "context.getString(R.stri\u2026rstitial_title_separator)");
        final String string2 = ((View)this).getContext().getString(2131951960);
        zzd.e((Object)string2, "context.getString(com.tw\u2026ents.legacy.R.string.and)");
        final int size = list2.size();
        String s;
        if (size != 0) {
            if (size != 1) {
                if (size != 2) {
                    final String m1 = or4.M1((Iterable)or4.h2((Iterable)list2, list2.size() - 1), (CharSequence)l7k.c(string, " "), (CharSequence)null, (CharSequence)null, (rtb)null, 62);
                    final Object o1 = or4.O1((List)list2);
                    final StringBuilder y = mb0.y(m1, string, " ", string2, " ");
                    y.append(o1);
                    s = y.toString();
                }
                else {
                    s = or4.M1((Iterable)list2, (CharSequence)zi.y(" ", string2, " "), (CharSequence)null, (CharSequence)null, (rtb)null, 62);
                }
            }
            else {
                s = (String)or4.G1((List)list2);
            }
        }
        else {
            s = "";
        }
        final Locale d = t4s.d();
        zzd.e((Object)d, "getLocale()");
        final String lowerCase = s.toLowerCase(d);
        zzd.e((Object)lowerCase, "this as java.lang.String).toLowerCase(locale)");
        final boolean b = lowerCase.length() > 0;
        String string3 = lowerCase;
        if (b) {
            final StringBuilder sb = new StringBuilder();
            final char char1 = lowerCase.charAt(0);
            String s2;
            if (Character.isLowerCase(char1)) {
                final Locale d2 = t4s.d();
                zzd.e((Object)d2, "getLocale()");
                s2 = tdy.X0(char1, d2);
            }
            else {
                s2 = String.valueOf(char1);
            }
            sb.append((Object)s2);
            final String substring = lowerCase.substring(1);
            zzd.e((Object)substring, "this as java.lang.String).substring(startIndex)");
            sb.append(substring);
            string3 = sb.toString();
        }
        this.V0.setText((CharSequence)((View)this).getContext().getString(2131957582, new Object[] { string3 }));
    }
    
    public final SimpleDraweeView z(final TweetMediaView$c tweetMediaView$c, final Integer n) {
        final SimpleDraweeView u0 = this.U0;
        int n2 = ((View)u0).getResources().getColor(2131099703);
        final int color = ((View)u0).getResources().getColor(2131099701);
        final ncq b = ncq.Companion.b(100, 100);
        final j0c j0c = u0.getHierarchy();
        if (n != null) {
            n2 = n;
        }
        j0c.n(1, (Drawable)new ColorDrawable(n2));
        final j0c j0c2 = u0.getHierarchy();
        final ColorDrawable colorDrawable = new ColorDrawable(color);
        ri4.n(6 < ((ts0)j0c2.e).E0.length, (Object)"The given index does not correspond to an overlay image.");
        j0c2.n(6, (Drawable)colorDrawable);
        Object a4 = null;
        Label_0264: {
            if (tweetMediaView$c != null) {
                final t8d$a a = tweetMediaView$c.a(((View)u0).getContext());
                if (a != null) {
                    a.r = false;
                    a.B = true;
                    a.l = tweetMediaView$c.b.p(b);
                    final t8d t8d = new t8d(a);
                    final ImageRequestBuilder b2 = ImageRequestBuilder.b(trb.a(t8d));
                    final Context context = ((View)u0).getContext();
                    zzd.e((Object)context, "context");
                    b2.i = (msk)new hhp(context, b);
                    final a a2 = b2.a();
                    final ffk a3 = urb.Companion.a().b().a();
                    ((ub)a3).c = new crb(t8d);
                    ((ub)a3).d = a2;
                    a4 = ((ub)a3).a();
                    break Label_0264;
                }
            }
            a4 = null;
        }
        u0.setController((ie9)a4);
        return u0;
    }
}
