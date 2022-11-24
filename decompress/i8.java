import androidx.fragment.app.Fragment;
import androidx.appcompat.app.f;
import android.content.Context;
import java.util.ArrayList;
import android.net.Uri;
import java.util.Objects;
import android.text.style.CharacterStyle;
import android.text.SpannableString;
import java.util.concurrent.TimeUnit;
import androidx.constraintlayout.widget.Group;
import com.twitter.media.ui.fresco.FrescoMediaImageView;
import com.twitter.ui.components.button.compose.HorizonComposeButton;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i8 implements xlx<j9, w7, m7>
{
    public final View F0;
    public final r7 G0;
    public final t5j<el6> H0;
    public final TextView I0;
    public final TextView J0;
    public final TextView K0;
    public final HorizonComposeButton L0;
    public final HorizonComposeButton M0;
    public final View N0;
    public final FrescoMediaImageView O0;
    public final View P0;
    public final View Q0;
    public final Group R0;
    public final TextView S0;
    public final ynl<vzv> T0;
    public final t5j<vzv> U0;
    public final h5s V0;
    public final fih<j9> W0;
    
    public i8(final View f0, final r7 g0, final t5j<el6> h0) {
        e0e.f((Object)f0, "rootView");
        e0e.f((Object)g0, "aboutModuleEffectHandler");
        e0e.f((Object)h0, "contactOptionClick");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = (TextView)f0.findViewById(2131432649);
        this.J0 = (TextView)f0.findViewById(2131430459);
        final TextView k0 = (TextView)f0.findViewById(2131427573);
        this.K0 = k0;
        final HorizonComposeButton l0 = (HorizonComposeButton)f0.findViewById(2131428677);
        this.L0 = l0;
        final HorizonComposeButton m0 = (HorizonComposeButton)f0.findViewById(2131428422);
        this.M0 = m0;
        this.N0 = f0.findViewById(2131428000);
        this.O0 = (FrescoMediaImageView)f0.findViewById(2131429917);
        this.P0 = f0.findViewById(2131427830);
        this.Q0 = f0.findViewById(2131429626);
        this.R0 = (Group)f0.findViewById(2131428719);
        this.S0 = (TextView)f0.findViewById(2131427380);
        final ynl t0 = new ynl();
        this.T0 = (ynl<vzv>)t0;
        this.U0 = (t5j<vzv>)((t5j)t0).throttleFirst(500L, TimeUnit.MILLISECONDS);
        this.V0 = (h5s)jty.N((ptb)new ptb<f9>(this) {
            public final i8 F0;
            
            public final Object invoke() {
                return new f9(this.F0, this.F0.F0.getContext());
            }
        });
        this.W0 = (fih<j9>)ma7.S((stb)new stb<fih$a<j9>, vzv>(this) {
            public final i8 F0;
            
            public final Object invoke(final Object o) {
                final fih$a fih$a = (fih$a)o;
                e0e.f((Object)fih$a, "$this$watch");
                fih$a.c(new dpe[] { (dpe)t8.F0 }, (stb)new x8(this.F0));
                fih$a.c(new dpe[] { (dpe)y8.F0 }, (stb)new z8(this.F0));
                fih$a.c(new dpe[] { (dpe)a9.F0 }, (stb)new b9(this.F0));
                fih$a.c(new dpe[] { (dpe)c9.F0 }, (stb)new d9(this.F0));
                fih$a.c(new dpe[] { (dpe)e9.F0 }, (stb)new j8(this.F0));
                fih$a.c(new dpe[] { (dpe)k8.F0 }, (stb)new l8(this.F0));
                fih$a.c(new dpe[] { (dpe)m8.F0 }, (stb)new n8(this.F0));
                fih$a.c(new dpe[] { (dpe)o8.F0 }, (stb)new p8(this.F0));
                fih$a.c(new dpe[] { (dpe)q8.F0 }, (stb)new r8(this.F0));
                fih$a.c(new dpe[] { (dpe)s8.F0 }, (stb)new u8(this.F0));
                fih$a.c(new dpe[] { (dpe)v8.F0 }, (stb)new w8(this.F0));
                return vzv.a;
            }
        });
        e0e.e((Object)l0, "directionsButton");
        b7x.z((View)l0, (wf)new h8(2131953125));
        e0e.e((Object)m0, "contactButton");
        b7x.z((View)m0, (wf)new h8(2131952820));
        k0.setMaxLines(2);
    }
    
    public final void T(final ccx ccx) {
        final j9 j9 = (j9)ccx;
        e0e.f((Object)j9, "state");
        this.W0.b((Object)j9);
    }
    
    public final SpannableString a(final SpannableString spannableString, final CharacterStyle characterStyle) {
        spannableString.setSpan((Object)characterStyle, 0, spannableString.length(), 33);
        return spannableString;
    }
    
    public final void r(final Object o) {
        final m7 m7 = (m7)o;
        e0e.f((Object)m7, "effect");
        final r7 g0 = this.G0;
        Objects.requireNonNull(g0);
        if (m7 instanceof m7$c) {
            final d6w b = g0.b;
            final String k0 = ((m7$c)m7).a.K0;
            e0e.e((Object)k0, "effect.businessUrl.url");
            b.c(k0);
        }
        else if (m7 instanceof m7$b) {
            final String encode = Uri.encode(((m7$b)m7).a);
            final StringBuilder sb = new StringBuilder();
            sb.append("geo:0,0?q=");
            sb.append(encode);
            final Uri parse = Uri.parse(sb.toString());
            e0e.e((Object)parse, "parse(\"geo:0,0?q=${Uri.encode(effect.address)}\")");
            g0.a("android.intent.action.VIEW", parse, 2131955571, (stb)new n7(g0.d));
        }
        else if (m7 instanceof m7$a) {
            final cl6 c = g0.c;
            final m7$a m7$a = (m7$a)m7;
            final dl6 a = m7$a.a;
            Objects.requireNonNull(c);
            e0e.f((Object)a, "contactOptionsConfig");
            final ArrayList list = new ArrayList();
            if (a.c) {
                final String string = ((Context)c.a).getString(2131957550);
                e0e.e((Object)string, "activity.getString(R.str\u2026rect_message_menu_option)");
                final String string2 = ((Context)c.a).getString(2131957549);
                e0e.e((Object)string2, "activity.getString(R.str\u2026d_direct_message_a11y_cd)");
                list.add(c.a(1, string, string2, ((Context)c.a).getString(2131953120)));
            }
            if (a.a) {
                final String string3 = ((Context)c.a).getString(2131957552);
                e0e.e((Object)string3, "activity.getString(R.str\u2026g.send_email_menu_option)");
                final String string4 = ((Context)c.a).getString(2131957551);
                e0e.e((Object)string4, "activity.getString(R.string.send_email_a11y_cd)");
                list.add(c.a(2, string3, string4, ((Context)c.a).getString(2131953787)));
            }
            if (a.d) {
                final String string5 = ((Context)c.a).getString(2131955766, new Object[] { a.e });
                e0e.e((Object)string5, "activity.getString(R.str\u2026tion, displayPhoneNumber)");
                final String string6 = ((Context)c.a).getString(2131952356, new Object[] { a.e });
                e0e.e((Object)string6, "activity.getString(R.str\u2026y_cd, displayPhoneNumber)");
                list.add(c.a(3, string5, string6, ((Context)c.a).getString(2131952355)));
            }
            if (a.b) {
                final String string7 = ((Context)c.a).getString(2131957560, new Object[] { a.e });
                e0e.e((Object)string7, "activity.getString(R.str\u2026tion, displayPhoneNumber)");
                final String string8 = ((Context)c.a).getString(2131958712, new Object[] { a.e });
                e0e.e((Object)string8, "activity.getString(R.str\u2026y_cd, displayPhoneNumber)");
                list.add(c.a(4, string7, string8, ((Context)c.a).getString(2131958708)));
            }
            final gm$b gm$b = new gm$b();
            ((ojf)gm$b.h).q((Iterable)list);
            final gm gm = (gm)((z4j)gm$b).e();
            final ul$b ul$b = new ul$b(632);
            ((pmp$a)ul$b).z((Object)gm);
            final bl1 w = ((cl1$a)ul$b).w();
            w.W1 = (dx8)new bl6((Object)list, (Object)c, 0);
            final int a2 = o5j.a;
            ((Fragment)w).S1();
            w.l2(((dob)c.a).P());
            final dl6 a3 = m7$a.a;
            if (a3.c) {
                g0.d.i();
            }
            if (a3.a) {
                g0.d.f();
            }
            if (a3.d) {
                g0.d.n();
            }
            if (a3.b) {
                g0.d.m();
            }
        }
        else if (m7 instanceof m7$e) {
            final long a4 = ((m7$e)m7).a;
            final ci7 f = g0.f;
            final f a5 = g0.a;
            final fci g2 = g0.g;
            final uk7$b uk7$b = new uk7$b();
            ((uk7$a)uk7$b).G(a4);
            ((ik1$a)uk7$b).x(true);
            f.d((Context)a5, g2, (uk7)((z4j)uk7$b).e());
        }
        else if (m7 instanceof m7$f) {
            final String a6 = ((m7$f)m7).a;
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("mailto:");
            sb2.append(a6);
            final Uri parse2 = Uri.parse(sb2.toString());
            e0e.e((Object)parse2, "parse(\"mailto:\" + effect.address)");
            g0.a("android.intent.action.SENDTO", parse2, 2131955567, (stb)new o7(g0.d));
        }
        else if (m7 instanceof m7$d) {
            final String a7 = ((m7$d)m7).a;
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("tel:");
            sb3.append(a7);
            final Uri parse3 = Uri.parse(sb3.toString());
            e0e.e((Object)parse3, "parse(\"tel:${effect.number}\")");
            g0.a("android.intent.action.DIAL", parse3, 2131955573, (stb)new p7(g0.d));
        }
        else if (m7 instanceof m7$g) {
            final String a8 = ((m7$g)m7).a;
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("sms:");
            sb4.append(a8);
            final Uri parse4 = Uri.parse(sb4.toString());
            e0e.e((Object)parse4, "parse(\"sms:${effect.number}\")");
            g0.a("android.intent.action.VIEW", parse4, 2131955575, (stb)new q7((Object)g0.d));
        }
    }
    
    public final t5j<w7> w() {
        final t5j map = this.U0.map((rtb)new ei((stb)i8$a.F0, 23));
        final HorizonComposeButton l0 = this.L0;
        e0e.e((Object)l0, "directionsButton");
        final t5j map2 = too.f((View)l0).map((rtb)new rla((stb)i8$b.F0, 19));
        final FrescoMediaImageView o0 = this.O0;
        e0e.e((Object)o0, "mapThumbnail");
        final t5j map3 = too.f((View)o0).map((rtb)new cu1((stb)i8$c.F0, 19));
        final HorizonComposeButton m0 = this.M0;
        e0e.e((Object)m0, "contactButton");
        final t5j merge = t5j.merge((Iterable)shw.y0((Object[])new t5j[] { map, map2, map3, too.f((View)m0).map((rtb)new uma((stb)i8$d.F0, 17)), this.H0.map((rtb)new vma((stb)i8$e.F0, 22)) }));
        e0e.e((Object)merge, "merge(\n        listOf(\n \u2026d(type) }\n        )\n    )");
        return (t5j<w7>)merge;
    }
}
