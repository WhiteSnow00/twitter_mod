import androidx.appcompat.widget.AppCompatTextView;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import com.twitter.ui.widget.TintableImageView;
import android.content.res.Resources;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import android.view.View$OnClickListener;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sfr extends b4e<ucr.b, xfr>
{
    public static final sfr.sfr$a Companion;
    public final ysq d;
    public final twq e;
    public final oko f;
    public final myn g;
    public final v2o h;
    public final viw i;
    public final m7n j;
    
    static {
        Companion = new sfr.sfr$a();
    }
    
    public sfr(final ysq d, final twq e, final oko f, final myn g, final v2o h, final viw i, final m7n j) {
        e0e.f((Object)d, "spacesLauncher");
        e0e.f((Object)e, "subscribeHandler");
        e0e.f((Object)f, "roomsScribeReporter");
        e0e.f((Object)g, "roomReminderToaster");
        e0e.f((Object)h, "roomRsvpDispatcher");
        e0e.f((Object)i, "userRepository");
        e0e.f((Object)j, "audioSpacesRepository");
        super((Class)ucr.b.class);
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public final void k(final n8x n8x, final Object o, final kcm kcm) {
        final xfr xfr = (xfr)n8x;
        final ucr.b b = (ucr.b)o;
        e0e.f((Object)xfr, "viewHolder");
        e0e.f((Object)b, "item");
        final x21 a = b.a;
        if (a.O != null) {
            final juq$a companion = juq.Companion;
            companion.c(xfr.Z0, xfr.a1, xfr.b1, xfr.d1, xfr.e1, a);
            if (b.a.k != null) {
                final TypefacesTextView c1 = xfr.c1;
                final Resources resources = xfr.getHeldView().getContext().getResources();
                e0e.e((Object)resources, "viewHolder.heldView.context.resources");
                final Long k = b.a.k;
                e0e.c((Object)k);
                ((TextView)c1).setText((CharSequence)iqs.e(resources, (long)k));
            }
            final TintableImageView f1 = xfr.f1;
            final Context context = xfr.getHeldView().getContext();
            e0e.e((Object)context, "heldView.context");
            final x21 a2 = b.a;
            if (a2.n) {
                this.o(f1, context);
                this.n(f1, context, a2);
            }
            else {
                this.q(f1, context);
                this.p(f1, context, a2);
            }
            final t5j<u2o> a3 = this.h.a();
            final e39 e39 = new e39();
            ((yz5)kcm.G0).q((sj)new ufr(e39));
            e39.c(a3.subscribe((rk6)new f$x3((stb)new vfr(b, this, xfr))));
            kcm.i((sj)new y7w(this.j.h(b.a.h).G((rk6)new ppl((stb)new tfr(this, xfr, b), 17), (rk6)lvb.e), 13));
            Objects.requireNonNull(sfr.Companion);
            final View heldView = xfr.getHeldView();
            final int b2 = b.b;
            final int c2 = b.c;
            final x21 a4 = b.a;
            final StringBuilder sb = new StringBuilder();
            final Resources resources2 = xfr.getHeldView().getResources();
            qlr.a1(sb, new String[] { resources2.getString(2131958516, new Object[] { b2 + 1, c2 }), ", " });
            final y21 o2 = a4.O;
            if (o2 != null) {
                qlr.a1(sb, new String[] { resources2.getString(2131958515, new Object[] { o2.c() }), ", " });
            }
            CharSequence text = ((AppCompatTextView)xfr.b1).getText();
            e0e.e((Object)text, "it");
            final boolean k2 = slr.k1(text);
            final CharSequence charSequence = null;
            if (!(k2 ^ true)) {
                text = null;
            }
            qlr.Z0(sb, new Object[] { text, ", " });
            CharSequence text2 = ((AppCompatTextView)xfr.c1).getText();
            e0e.e((Object)text2, "it");
            if (!(slr.k1(text2) ^ true)) {
                text2 = null;
            }
            qlr.Z0(sb, new Object[] { text2, ", " });
            CharSequence contentDescription = ((View)xfr.f1).getContentDescription();
            e0e.e((Object)contentDescription, "it");
            if (!(slr.k1(contentDescription) ^ true)) {
                contentDescription = null;
            }
            qlr.Z0(sb, new Object[] { contentDescription, ", " });
            final CharSequence text3 = ((AppCompatTextView)xfr.e1).getText();
            e0e.e((Object)text3, "it");
            CharSequence charSequence2 = charSequence;
            if (slr.k1(text3) ^ true) {
                charSequence2 = text3;
            }
            sb.append(charSequence2);
            final String string = sb.toString();
            e0e.e((Object)string, "StringBuilder().apply {\n\u2026t) }\n        }.toString()");
            heldView.setContentDescription((CharSequence)string);
            companion.a(xfr.g1, this.i, Long.parseLong(b.a.f), kcm);
        }
        else {
            ((View)xfr.Z0).setVisibility(8);
        }
        xfr.getHeldView().setOnClickListener((View$OnClickListener)new bb8((Object)this, (Object)b, 16));
    }
    
    public final n8x l(final ViewGroup viewGroup) {
        final View x = m51.x(viewGroup, "parent", 2131625728, viewGroup, false);
        e0e.e((Object)x, "view");
        return (n8x)new xfr(x);
    }
    
    public final void n(final TintableImageView tintableImageView, final Context context, final x21 x21) {
        ((View)tintableImageView).setContentDescription((CharSequence)context.getString(2131958518));
        ((View)tintableImageView).setOnClickListener((View$OnClickListener)new hf4((Object)this, (Object)tintableImageView, (Object)context, (Object)x21, 3));
    }
    
    public final void o(final TintableImageView tintableImageView, final Context context) {
        juq.Companion.d(tintableImageView, context, 2131232281, 2130968593, 2130968583);
    }
    
    public final void p(final TintableImageView tintableImageView, final Context context, final x21 x21) {
        ((View)tintableImageView).setContentDescription((CharSequence)context.getString(2131958517));
        ((View)tintableImageView).setOnClickListener((View$OnClickListener)new v5i(this, tintableImageView, context, x21, 2));
    }
    
    public final void q(final TintableImageView tintableImageView, final Context context) {
        juq.Companion.d(tintableImageView, context, 2131232279, 2130968583, 2130968593);
    }
}
