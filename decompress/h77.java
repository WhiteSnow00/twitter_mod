import java.util.Iterator;
import android.content.res.Resources;
import android.view.View$OnClickListener;
import com.twitter.media.ui.image.UserImageView;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import android.view.View;
import android.view.ViewGroup$MarginLayoutParams;
import android.net.Uri;
import java.util.Collection;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.b;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import android.widget.TextView;
import android.view.ViewGroup;
import java.util.ArrayList;
import com.twitter.onboarding.ocf.analytics.OcfEventReporter;
import com.twitter.onboarding.ocf.NavigationHandler;
import android.view.LayoutInflater;
import com.twitter.media.ui.fresco.FrescoDraweeView;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h77 extends x7x
{
    public final List<jcj> I0;
    public FrescoDraweeView J0;
    
    public h77(final r8x r8x, final LayoutInflater layoutInflater, final dtr dtr, final dej dej, final NavigationHandler navigationHandler, final OcfEventReporter ocfEventReporter, final if1 if1, final ezb ezb) {
        super(r8x);
        this.I0 = new ArrayList();
        final int a = c5j.a;
        final g77 g77 = (g77)dtr;
        final View inflate = layoutInflater.inflate(2131625050, (ViewGroup)null);
        final TextView textView = (TextView)inflate.findViewById(2131430697);
        final TextView textView2 = (TextView)inflate.findViewById(2131431297);
        final TextView textView3 = (TextView)inflate.findViewById(2131428653);
        final ViewGroup viewGroup = (ViewGroup)inflate.findViewById(2131429756);
        final TypefacesTextView typefacesTextView = (TypefacesTextView)inflate.findViewById(2131429252);
        this.J0 = (FrescoDraweeView)inflate.findViewById(2131429416);
        pdj pdj = ((dtr)g77).f.c;
        if (pdj == null) {
            pdj = g77.p;
        }
        final int n = (int)inflate.findViewById(2131429757).getResources().getDimension(2131166792);
        final int o = g77.o;
        final ConstraintLayout constraintLayout = (ConstraintLayout)inflate.findViewById(2131428419);
        final b b = new b();
        b.g(constraintLayout);
        if (o != 2) {
            if (o != 3) {
                b.f(2131429756, 4);
                b.f(2131429757, 4);
                b.i(2131429756, 3, 2131429757, 4);
                ((View)inflate.findViewById(2131431247)).setLayoutParams((ViewGroup$LayoutParams)new LinearLayout$LayoutParams(-1, -2, 0.0f));
            }
        }
        else {
            b.i(2131429756, 3, 2131429757, 4);
        }
        b.b(constraintLayout);
        dej.b(textView, (oxm)((dtr)g77).f.a);
        dej.b(textView2, (oxm)((dtr)g77).f.b);
        dej.b(textView3, (oxm)g77.j);
        dej.b((TextView)typefacesTextView, (oxm)g77.r);
        final int m = g77.m;
        Label_0405: {
            int textAlignment;
            if (m != 1) {
                if (m != 2) {
                    m8a.d((Throwable)new RuntimeException("Invalid text alignment"));
                    break Label_0405;
                }
                textAlignment = 4;
            }
            else {
                textAlignment = 2;
            }
            for (int i = 0; i < 2; ++i) {
                final TextView textView4 = (new TextView[] { textView, textView2 })[i];
                if (textView4 != null) {
                    ((View)textView4).setTextAlignment(textAlignment);
                }
            }
        }
        final List q = g77.q;
        if (q != null) {
            this.I0.addAll(q);
        }
        else {
            E1(g77.k, ((dtr)g77).a, this.I0);
            E1(g77.l, ((dtr)g77).b, this.I0);
        }
        if (pdj != null) {
            final FrescoDraweeView j0 = this.J0;
            final z6d a2 = pdj.a.a;
            if (a2 == null) {
                ho0.z("Image not present in OCFImageConfig");
            }
            else {
                final edq e0 = a2.E0;
                if (e0.b > 0 && e0.a > 0) {
                    final String d0 = a2.D0;
                    if (d0 == null) {
                        ho0.z("Url not present in OCFImageConfig");
                    }
                    else {
                        final Uri parse = Uri.parse(d0);
                        final Resources resources = inflate.getResources();
                        final int b2 = pdj.b;
                        final ihc$a companion = ihc.Companion;
                        final int c = companion.c(resources, b2);
                        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)((View)j0).getLayoutParams();
                        float b3;
                        if (pdj.b == 2) {
                            b3 = 1.0f;
                            viewGroup$MarginLayoutParams.setMargins(n, c, n, viewGroup$MarginLayoutParams.bottomMargin);
                        }
                        else {
                            b3 = companion.b(((View)j0).getResources(), (View)j0, a2, pdj.b);
                            viewGroup$MarginLayoutParams.setMargins(inflate.getPaddingLeft(), c, inflate.getPaddingRight(), viewGroup$MarginLayoutParams.bottomMargin);
                        }
                        ((ud9)j0).setAspectRatio(b3);
                        ((View)j0).setVisibility(0);
                        final lzb lzb = new lzb(inflate.getResources());
                        lzb.l = companion.a(pdj.b);
                        ((ud9)j0).setHierarchy((sd9)lzb.a());
                        final x7d x7d = new x7d(x7d.g(d0));
                        final lfk d2 = sqb.a().d();
                        ((sb)d2).c = new ypb(x7d);
                        ((sb)d2).d = ImageRequestBuilder.c(parse).a();
                        ((ud9)j0).setController(((sb)d2).a());
                    }
                }
                else {
                    ho0.z("OCFImageConfig width or height less than zero:");
                }
            }
            ((View)this.J0).setVisibility(0);
        }
        final Iterator iterator = this.I0.iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            final jcj jcj = (jcj)iterator.next();
            final kcj kcj = new kcj(layoutInflater);
            czd.f((Object)jcj, "ocfButton");
            czd.f((Object)navigationHandler, "navigationHandler");
            kcj.a(jcj, navigationHandler, dej, true);
            viewGroup.addView((View)kcj.a, n2);
            ++n2;
        }
        final View viewById = inflate.findViewById(2131432468);
        final cgv d3 = ((dtr)g77).f.d;
        if (d3 != null) {
            final TextView textView5 = (TextView)inflate.findViewById(2131432494);
            final TextView textView6 = (TextView)inflate.findViewById(2131432467);
            final UserImageView userImageView = (UserImageView)inflate.findViewById(2131432470);
            viewById.setVisibility(0);
            userImageView.H(d3);
            textView5.setText((CharSequence)d3.c());
            textView6.setText((CharSequence)ikr.l(d3.K0));
        }
        else {
            viewById.setVisibility(8);
        }
        if1.a(inflate, ((dtr)g77).d, (View$OnClickListener)null);
        ezb.d();
        ezb.a(inflate);
        this.C1(inflate);
        ocfEventReporter.c();
    }
    
    public static void E1(final int c, final ssv a, final List<jcj> list) {
        if (a == null) {
            return;
        }
        final jcj$a jcj$a = new jcj$a();
        jcj$a.a = a;
        jcj$a.c = c;
        list.add((jcj)((n4j)jcj$a).e());
    }
}
