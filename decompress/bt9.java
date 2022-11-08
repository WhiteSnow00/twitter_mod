import android.os.BaseBundle;
import android.widget.BaseAdapter;
import com.twitter.media.ui.image.d;
import androidx.appcompat.widget.AppCompatEditText;
import java.util.concurrent.Callable;
import java.util.Iterator;
import java.util.Locale;
import java.util.ArrayList;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.twitter.profiles.EditProfileAvatarContentViewArgs;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.regex.Matcher;
import android.view.ViewGroup;
import android.graphics.Rect;
import android.widget.Filter$FilterResults;
import android.widget.Filter;
import android.view.MenuItem;
import android.view.Menu;
import java.util.List;
import android.view.ViewTreeObserver;
import com.twitter.ui.widget.PopupEditText$a;
import com.twitter.app.common.args.ContentViewArgs;
import java.util.Objects;
import android.graphics.Typeface;
import android.widget.TextView;
import android.graphics.drawable.ColorDrawable;
import android.text.InputFilter$LengthFilter;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.text.method.KeyListener;
import android.graphics.drawable.Drawable;
import android.content.Context;
import android.os.Parcelable;
import android.os.Bundle;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;
import com.twitter.ui.widget.TwitterEditText;
import android.widget.EditText;
import com.twitter.app.profiles.api.EditVerifiedPhoneContentViewResult;
import com.twitter.app.profiles.api.EditVerifiedPhoneArgs;
import com.twitter.profiles.editbirthdate.EditBirthdateContentViewResult;
import com.twitter.profiles.editbirthdate.EditBirthdateArgs;
import com.twitter.app.profiles.api.EditPronounsContentViewResult;
import com.twitter.app.profiles.api.EditPronounsArgs;
import com.twitter.business.api.ProfessionalSettingsContentViewResult;
import com.twitter.business.api.ProfessionalSettingsContentViewArgs;
import com.twitter.tipjar.data.TipJarSuccess;
import com.twitter.tipjar.data.TipJarActivityArgs;
import java.util.regex.Pattern;
import android.widget.ScrollView;
import com.twitter.ui.components.button.compose.HorizonComposeButton;
import android.widget.ImageView;
import com.twitter.ui.widget.PopupEditText;
import android.view.View;
import android.view.ViewTreeObserver$OnScrollChangedListener;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.widget.Filterable;
import android.view.View$OnClickListener;
import android.view.View$OnFocusChangeListener;
import com.twitter.ui.widget.PopupEditText$c;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bt9 extends jl1 implements PopupEditText$c, View$OnFocusChangeListener, View$OnClickListener, Filterable, ViewTreeObserver$OnGlobalLayoutListener, ViewTreeObserver$OnScrollChangedListener, c7g
{
    public View A1;
    public PopupEditText B1;
    public ImageView C1;
    public boolean D1;
    public HorizonComposeButton E1;
    public final ScrollView F1;
    public String G1;
    public String H1;
    public String I1;
    public final boolean J1;
    public ona K1;
    public ona L1;
    public d7g M1;
    public a7g N1;
    public final Pattern O1;
    public final xn6<et9, String> P1;
    public final xn6<TipJarActivityArgs, TipJarSuccess> Q1;
    public final xn6<ProfessionalSettingsContentViewArgs, ProfessionalSettingsContentViewResult> R1;
    public final xn6<EditPronounsArgs, EditPronounsContentViewResult> S1;
    public final xn6<EditBirthdateArgs, EditBirthdateContentViewResult> T1;
    public final xn6<EditVerifiedPhoneArgs, EditVerifiedPhoneContentViewResult> U1;
    public final u9m V1;
    public snj<v3l> W1;
    public final ibm X1;
    public final bft Y1;
    public final f4l Z1;
    public EditText u1;
    public EditText v1;
    public EditText w1;
    public TwitterEditText x1;
    public TwitterEditText y1;
    public View z1;
    
    public bt9(final Intent intent, final z7x z7x, final Resources resources, final p9s p9s, final fxe<z9i> fxe, final kn kn, final gob gob, final uaf uaf, final sag sag, final LayoutInflater layoutInflater, final pca<p4h> pca, final UserIdentifier userIdentifier, final cbv cbv, final fxe<spa> fxe2, final q6g q6g, final c8p c8p, final gam gam, final mbi<?> mbi, final r6p r6p, final pca<bo> pca2, final Bundle bundle, final sso sso, final s4g s4g, final ibm x1, final bft y1, final f4l z1, final ocw ocw, final hlv hlv, final on6 on6, final a8p a8p) {
        super(intent, z7x, resources, p9s, (fxe)fxe, kn, gob, uaf, sag, layoutInflater, (pca)pca, userIdentifier, cbv, (fxe)fxe2, q6g, c8p, gam, (mbi)mbi, r6p, (pca)pca2, bundle, sso, s4g, x1, on6, a8p);
        boolean b = true;
        this.D1 = true;
        final snj b2 = snj.b;
        final int a = w4j.a;
        this.W1 = (snj<v3l>)b2;
        sso.a((vro)new jt2() {
            public final void a(final Bundle bundle) {
                bundle.putParcelable("location_state", (Parcelable)bt9.this.N1);
                bundle.putBoolean("show_camera", bt9.this.D1);
                yvj.k(bundle, "updated_birthdate_extended_profile", (Object)bt9.this.L1, (alp)ona.i);
            }
            
            public final void v(final Parcelable parcelable) {
                final Bundle bundle = (Bundle)parcelable;
                bt9.this.N1 = (a7g)bundle.getParcelable("location_state");
                bt9.this.D1 = bundle.getBoolean("show_camera");
            }
        });
        this.Y1 = y1;
        final boolean g = ocw.g();
        final int n = 0;
        if (g && lcs.b()) {
            y1.e((CharSequence)((Context)gob).getString(2131958700, new Object[] { ocw.b() }), 1);
            ((x9)this).D4();
        }
        this.F1 = (ScrollView)((x9)this).C4(2131431244);
        this.u1 = (EditText)((x9)this).C4(2131428882);
        this.v1 = (EditText)((x9)this).C4(2131428896);
        if (dta.b().b("edit_profile_username_enabled", false)) {
            ((TextView)this.v1).setCompoundDrawablesWithIntrinsicBounds(qli.g((Context)gob, 2131231555), (Drawable)null, (Drawable)null, (Drawable)null);
        }
        else {
            ((View)this.v1).setVisibility(8);
        }
        this.w1 = (EditText)((x9)this).C4(2131428898);
        this.x1 = (TwitterEditText)((x9)this).C4(2131427811);
        this.B1 = (PopupEditText)((x9)this).C4(2131428881);
        this.y1 = (TwitterEditText)((x9)this).C4(2131430807);
        this.z1 = ((x9)this).C4(2131432527);
        this.A1 = ((x9)this).C4(2131432065);
        this.E1 = (HorizonComposeButton)((x9)this).C4(2131431865);
        ((View)this.x1).setOnClickListener((View$OnClickListener)this);
        ((AppCompatEditText)this.x1).setKeyListener(null);
        if (dta.b().b("profile_foundations_pronouns_enabled", false)) {
            ((View)this.y1).setOnClickListener((View$OnClickListener)this);
            ((AppCompatEditText)this.y1).setKeyListener(null);
            ((View)this.y1).setVisibility(0);
        }
        else {
            ((View)this.y1).setVisibility(8);
        }
        if (dta.b().b("verified_phone_label_enabled", false)) {
            this.z1.setOnClickListener((View$OnClickListener)this);
            this.z1.setVisibility(0);
            final View viewById = this.z1.findViewById(2131432528);
            final View viewById2 = this.A1.findViewById(2131432066);
            this.q5(viewById);
            this.q5(viewById2);
        }
        else {
            this.z1.setVisibility(8);
        }
        this.A1.setOnClickListener((View$OnClickListener)this);
        final xn6<zm, String> h = ((abv)this).Q0.h(String.class, (bsm<String>)xa0.D0);
        this.P1 = (xn6<et9, String>)h;
        this.X1 = x1;
        this.Z1 = z1;
        f.i((b5j)h.a(), (u93)new fpa(this, 6));
        final xn6<ContentViewArgs, TipJarSuccess> a2 = ((abv)this).Q0.a(TipJarSuccess.class);
        this.Q1 = (xn6<TipJarActivityArgs, TipJarSuccess>)a2;
        f.i((b5j)a2.c(), (u93)new ngc((Object)this, 12));
        final xn6<ContentViewArgs, ProfessionalSettingsContentViewResult> a3 = ((abv)this).Q0.a(ProfessionalSettingsContentViewResult.class);
        this.R1 = (xn6<ProfessionalSettingsContentViewArgs, ProfessionalSettingsContentViewResult>)a3;
        f.i((b5j)a3.c(), (u93)new lg1((Object)this, 12));
        final xn6<ContentViewArgs, EditPronounsContentViewResult> a4 = ((abv)this).Q0.a(EditPronounsContentViewResult.class);
        this.S1 = (xn6<EditPronounsArgs, EditPronounsContentViewResult>)a4;
        f.i((b5j)a4.c(), (u93)new ril((Object)this, 12));
        final xn6<ContentViewArgs, EditVerifiedPhoneContentViewResult> a5 = ((abv)this).Q0.a(EditVerifiedPhoneContentViewResult.class);
        this.U1 = (xn6<EditVerifiedPhoneArgs, EditVerifiedPhoneContentViewResult>)a5;
        f.i((b5j)a5.c(), (u93)hs9.c);
        final xn6<ContentViewArgs, EditBirthdateContentViewResult> a6 = mbi.a(EditBirthdateContentViewResult.class);
        this.T1 = (xn6<EditBirthdateArgs, EditBirthdateContentViewResult>)a6;
        f.i((b5j)a6.c(), (u93)new kg1((Object)this, 12));
        final RelativeLayout relativeLayout = (RelativeLayout)((x9)this).C4(2131432668);
        pf8.r(relativeLayout);
        ((ViewGroup)relativeLayout).addView((View)super.f1);
        final d7g m1 = new d7g((Context)gob, "me", "profile");
        this.M1 = m1;
        m1.L0 = (c7g)this;
        if (hlv.b("profile_structured_location_enabled", false)) {
            final PopupEditText b3 = this.B1;
            final d7g m2 = this.M1;
            if (m2.H0 == null) {
                m2.H0 = new d7g$a(m2.C0);
            }
            b3.setAdapter((ListAdapter)m2.H0);
            this.B1.setPopupEditTextListener((PopupEditText$c)this);
            final PopupEditText b4 = this.B1;
            final PopupEditText$a r1 = PopupEditText.R1;
            b4.j((Filterable)this, (long)hhv.b());
            this.B1.setOnClickListener((View$OnClickListener)this);
            final ViewTreeObserver viewTreeObserver = ((View)this.B1).getViewTreeObserver();
            viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
            viewTreeObserver.addOnScrollChangedListener((ViewTreeObserver$OnScrollChangedListener)this);
            ((TwitterEditText)this.B1).setOnFocusChangeListener((View$OnFocusChangeListener)this);
        }
        ((TextView)this.B1).addTextChangedListener((TextWatcher)new bt9$b(this));
        final hfv user = ncw.d().getUser();
        final ys9 ys9 = new ys9(intent);
        final boolean booleanExtra = ((dj1)ys9).mIntent.getBooleanExtra("failure", false);
        this.J1 = booleanExtra;
        ((View)this.v1).setOnClickListener((View$OnClickListener)new qi2((Object)this, 10));
        if (booleanExtra) {
            String s;
            jeu h2;
            String s2;
            String s3;
            vdv vdv;
            if (intent.getBooleanExtra("update_profile", false)) {
                s = intent.getStringExtra("name");
                h2 = (jeu)intent.getParcelableExtra("description");
                s2 = intent.getStringExtra("url");
                s3 = intent.getStringExtra("location");
                vdv = (vdv)tkp.a(intent.getByteArrayExtra("structured_location"), (alp)vdv.m);
            }
            else {
                s = user.c();
                h2 = bgl.h(user, true);
                s2 = user.G0;
                s3 = user.P0;
                vdv = (vdv)snj.d(user.Q0);
            }
            this.r5(s, user.J0, h2, s2, s3, vdv, null);
            final byte[] byteArrayExtra = ((dj1)ys9).mIntent.getByteArrayExtra("avatar_media_file");
            final kvg$a g2 = kvg.g;
            final kvg kvg = (kvg)tkp.a(byteArrayExtra, (alp)g2);
            if (kvg != null) {
                final uzg h3 = uzg.H0;
                final jx6 f0 = ww9.F0;
                super.Y0 = (rw9)ww9.k(kvg, kvg.g(), h3, (String)null);
                this.h5();
            }
            final kvg kvg2 = (kvg)tkp.a(((dj1)ys9).mIntent.getByteArrayExtra("avatar_media_file"), (alp)g2);
            if (kvg2 != null) {
                final uzg h4 = uzg.H0;
                final jx6 f2 = ww9.F0;
                final rw9 z2 = (rw9)ww9.k(kvg2, kvg2.g(), h4, (String)null);
                super.Z0 = z2;
                super.f1.L(z2.toString());
            }
        }
        else {
            this.r5(user.c(), user.J0, bgl.h(user, true), user.G0, user.P0, (vdv)snj.d(user.Q0), user.c1);
        }
        ((TextView)this.u1).setFilters(new InputFilter[] { (InputFilter)new InputFilter$LengthFilter(hlv.f("user_display_name_max_limit", resources.getInteger(2131492951))) });
        final EditText u1 = this.u1;
        u1.setSelection(((TextView)u1).length());
        ((TextView)this.u1).addTextChangedListener((TextWatcher)new bt9$c(this));
        ((d)super.e1).setDefaultDrawable((Drawable)new ColorDrawable(bgl.e(super.d1, (Context)gob)));
        ((View)super.f1).setOnClickListener((View$OnClickListener)this);
        ((View)super.e1).setOnClickListener((View$OnClickListener)this);
        if (bundle != null && !(this.D1 = bundle.getBoolean("show_camera"))) {
            this.C1.setVisibility(8);
        }
        final ona s4 = super.d1.S0;
        if (s4 != null) {
            this.K1 = s4;
        }
        if (bundle != null) {
            this.L1 = (ona)tkp.a(bundle.getByteArray("updated_birthdate_extended_profile"), (alp)ona.i);
        }
        else {
            final ona k1 = this.K1;
            if (k1 != null) {
                this.L1 = (ona)new ona.a(k1).e();
            }
        }
        this.o5(this.L1);
        if (bundle == null && intent.getBooleanExtra("edit_birthdate", false)) {
            this.s5();
        }
        this.O1 = Pattern.compile(hlv.k("profile_invalid_name_bio_regex"));
        final TextView textView = (TextView)this.z1.findViewById(16908310);
        textView.setTypeface((Typeface)null, 1);
        textView.setText(2131953752);
        ((TextView)this.z1.findViewById(16908304)).setText(2131959543);
        final TextView textView2 = (TextView)this.A1.findViewById(16908310);
        textView2.setTypeface((Typeface)null, 1);
        textView2.setText((CharSequence)hct.a((Context)gob, 2131958889));
        final View a7 = this.A1;
        Objects.requireNonNull(hbt.Companion);
        final hlv b5 = dta.b();
        Label_1674: {
            if (b5.b("tip_jar_profile_enabled", false) && b5.b("tip_jar_profile_settings_enabled", false)) {
                final List g3 = b5.g("tip_jar_profile_settings_enabled_services");
                zzd.e((Object)g3, "getList<String>(LegacyFS\u2026ETTINGS_SERVICES_ENABLED)");
                if (g3.isEmpty() ^ true) {
                    break Label_1674;
                }
            }
            b = false;
        }
        int visibility;
        if (b) {
            visibility = n;
        }
        else {
            visibility = 8;
        }
        a7.setVisibility(visibility);
        this.t5();
        final u9m a8 = u9m.Companion.a((Context)gob);
        this.V1 = a8;
        f.j(a8.a().subscribeOn(yvo.c()).observeOn(h6q.L()), (u93)new en((Object)this, 14), (raa)x1);
        ro.a((pca)pca2, 300, (u93)new dgk((Object)this, 14));
    }
    
    public static boolean l5(final EditText editText, final String s) {
        String string;
        if (editText != null) {
            string = editText.getText().toString();
        }
        else {
            string = null;
        }
        return (s == null && pjr.g((CharSequence)string)) || (s != null && !s.equals(string));
    }
    
    public final boolean N2(final fai fai, final Menu menu) {
        fai.z(2131689542, menu);
        return true;
    }
    
    public final void N4() {
        final d7g m1 = this.M1;
        if (m1 != null) {
            m1.L0 = null;
            this.M1 = null;
        }
        if (!((Activity)((x9)this).D0).isChangingConfigurations() && !super.k1) {
            final rw9 y0 = super.Y0;
            if (y0 != null) {
                ((ww9)y0).n();
            }
            final rw9 z0 = super.Z0;
            if (z0 != null) {
                ((ww9)z0).n();
            }
        }
        super.l1.a = null;
    }
    
    public final void P4() {
        if (((Activity)((x9)this).D0).isFinishing() && ((View)this.B1).hasFocus()) {
            this.p5();
        }
        super.P4();
    }
    
    public final void Q4() {
        super.Q4();
        final u9m v1 = this.V1;
        if (v1 != null) {
            final ibm x1 = this.X1;
            zzd.f((Object)x1, "releaseCompletable");
            if (v1.a.a.getBoolean("professional_should_update_user", false)) {
                final qv1 e = v1.e;
                final snj b = snj.b;
                final int a = w4j.a;
                e.accept((Object)b);
                final b5j p = ((omm)v1.c).S((Object)new vfp(v1.d)).P();
                zzd.e((Object)p, "selfUserResultShowNetwor\u2026          .toObservable()");
                final m29 m29 = new m29();
                x1.d().q((rj)new v9m(m29));
                m29.c(p.subscribe((fk6)new f$t2((rtb)new w9m(v1))));
            }
        }
    }
    
    public final void a3() {
        if (this.X4()) {
            this.i5();
        }
        else {
            this.g5(((x9)this).J0, new String[] { zf4.E(super.W0, "", "", "cancel") });
            ((x9)this).E0.cancel();
        }
    }
    
    public final void b0() {
        this.k5();
    }
    
    public final boolean b5() {
        final boolean w4 = this.W4();
        boolean b2;
        final boolean b = b2 = true;
        if (!w4) {
            b2 = b;
            if (!this.j5()) {
                b2 = b;
                if (!this.J1) {
                    b2 = b;
                    if (!l5(this.u1, this.H1)) {
                        b2 = b;
                        if (!l5(this.v1, this.I1)) {
                            b2 = b;
                            if (!l5((EditText)this.B1, this.M1.K0)) {
                                b2 = b;
                                if (!this.M1.d()) {
                                    b2 = ((w4j.a((Object)this.K1, (Object)this.L1) ^ true) && b);
                                }
                            }
                        }
                    }
                }
            }
        }
        return b2;
    }
    
    public final int d2(final fai fai) {
        final MenuItem item = fai.findItem(2131431173);
        pf8.r(item);
        item.setEnabled(pjr.g((CharSequence)this.u1.getText().toString().trim()));
        return 2;
    }
    
    public final void f4(final CharSequence charSequence) {
        if (((View)this.B1).hasFocus()) {
            this.M1.g(this.n5());
        }
    }
    
    public final Filter getFilter() {
        return new Filter() {
            public final CharSequence convertResultToString(final Object o) {
                return bt9.this.n5();
            }
            
            public final Filter$FilterResults performFiltering(final CharSequence charSequence) {
                return null;
            }
            
            public final void publishResults(final CharSequence charSequence, final Filter$FilterResults filter$FilterResults) {
            }
        };
    }
    
    public final boolean j5() {
        return l5(this.w1, this.G1);
    }
    
    public final void k5() {
        if (this.B1.i()) {
            final Rect rect = new Rect();
            ((View)this.B1).getWindowVisibleDisplayFrame(rect);
            final double n = rect.height();
            final ViewGroup k4 = ((x9)this).K4();
            pf8.r(k4);
            if (n > ((x9)this).L0.getDimension(2131166027) * 1.5 + (((View)this.B1).getHeight() + ((View)k4).getHeight())) {
                if (!((BaseAdapter)this.M1.H0).isEmpty()) {
                    final int[] array = new int[2];
                    ((View)this.F1).getLocationOnScreen(array);
                    final int n2 = array[1];
                    ((View)this.B1).getLocationOnScreen(array);
                    final ScrollView f1 = this.F1;
                    f1.scrollTo(0, ((View)f1).getScrollY() + array[1] - n2);
                }
            }
            else {
                this.B1.h();
            }
        }
    }
    
    public final void m2() {
        this.k5();
    }
    
    public final String m5(String h, final int n) {
        final ijf h2 = ijf.H();
        final Matcher matcher = this.O1.matcher(h);
        while (matcher.find()) {
            h2.p((Object)matcher.group());
        }
        h = pjr.h((CharSequence)"", (Iterable)h2);
        if (!h.isEmpty()) {
            return ((Context)((x9)this).D0).getString(n, new Object[] { h });
        }
        return null;
    }
    
    public final String n5() {
        return ((AppCompatEditText)this.B1).getText().toString();
    }
    
    public final void o5(final ona ona) {
        if (ona != null && ona.a()) {
            final Calendar instance = Calendar.getInstance();
            instance.set(ona.d, ona.c - 1, ona.b);
            ((TextView)this.x1).setText((CharSequence)DateFormat.getDateInstance(1).format(instance.getTime()));
            final Resources l0 = ((x9)this).L0;
            final TwitterEditText x1 = this.x1;
            final StringBuilder sb = new StringBuilder();
            sb.append(l0.getString(2131953737));
            sb.append(" ");
            sb.append(bgl.l(ona.e, l0));
            sb.append("\n");
            sb.append(l0.getString(2131953740));
            sb.append(" ");
            sb.append(bgl.l(ona.f, l0));
            x1.setHelperMessage((CharSequence)sb.toString());
        }
        else {
            ((TextView)this.x1).setText((CharSequence)"");
            this.x1.setHelperMessage((CharSequence)"");
        }
    }
    
    public final void onClick(final View view) {
        if (view == this.B1) {
            this.M1.g(this.n5());
        }
        else if (view == this.x1) {
            this.s5();
        }
        else if (view == this.y1) {
            this.S1.d(EditPronounsArgs.INSTANCE);
        }
        else if (view == this.z1) {
            this.U1.d(EditVerifiedPhoneArgs.INSTANCE);
        }
        else if (view == this.A1) {
            this.Q1.d(new TipJarActivityArgs(false));
        }
        else if (view == this.E1) {
            if (this.W1.f()) {
                final f4l z1 = this.Z1;
                final xn6<ProfessionalSettingsContentViewArgs, ProfessionalSettingsContentViewResult> r1 = this.R1;
                Objects.requireNonNull(z1);
                zzd.f((Object)r1, "control");
                Objects.requireNonNull(dt9.Companion);
                saw.b((okm)new zf4(dt9.a));
                r1.d(ProfessionalSettingsContentViewArgs.INSTANCE);
            }
            else {
                final f4l z2 = this.Z1;
                final gob d0 = ((x9)this).D0;
                Objects.requireNonNull(z2);
                zzd.f((Object)d0, "activity");
                Objects.requireNonNull(dt9.Companion);
                saw.b((okm)new zf4(dt9.c));
                d0.startActivityForResult(rez.p((Context)d0, 1), 300);
            }
        }
        else {
            final int id = view.getId();
            if (id != 2131429415 && id != 2131429407) {
                if (id == 2131427742 || id == 2131427739) {
                    this.g5(((x9)this).J0, new String[] { zf4.E(super.W0, "", "avatar", "click") });
                    final gob d2 = ((x9)this).D0;
                    d2.startActivityForResult(super.s1.a((Context)d2, (ContentViewArgs)new EditProfileAvatarContentViewArgs(false)), 4);
                }
            }
            else {
                this.g5(((x9)this).J0, new String[] { zf4.E(super.W0, "", "header_image", "click") });
                if (!super.j1 && !super.c1) {
                    super.a1 = false;
                    mzg.c((Activity)((x9)this).D0, 2);
                }
                else {
                    this.e5();
                    final Bundle bundle = new Bundle();
                    ((BaseBundle)bundle).putInt("twitter:id", 1);
                    final ArrayList i1 = super.i1;
                    bundle.putCharSequenceArray("items", (CharSequence[])i1.toArray(new CharSequence[i1.size()]));
                    final int a = w4j.a;
                    if (!((BaseBundle)bundle).containsKey("twitter:id")) {
                        throw new Fragment.InstantiationException("Missing fragment id", null);
                    }
                    final wil j = yqh.i(bundle);
                    ((cl1)j).Q1 = (jw8)this;
                    ((cl1)j).e2(((x9)this).I4(), (String)null);
                }
            }
        }
    }
    
    public final void onFocusChange(final View view, final boolean b) {
        if (view == this.B1) {
            final String n5 = this.n5();
            if (b) {
                this.M1.g(n5);
                this.g5(super.d1.f(), new String[] { "me:profile:structured_location:location_picker:open" });
            }
            else if (this.M1.J0 == null) {
                this.p5();
            }
        }
    }
    
    public final void onGlobalLayout() {
        this.k5();
    }
    
    public final void onScrollChanged() {
        this.k5();
    }
    
    public final void p5() {
        final d7g m1 = this.M1;
        final String n5 = this.n5();
        final UserIdentifier f = super.d1.f();
        final long d = super.X0.d();
        Objects.requireNonNull(m1);
        if (dta.b().b("profile_structured_location_enabled", false)) {
            final String k0 = m1.K0;
            final Pattern a = pjr.a;
            if (!zzd.a((Object)k0, (Object)n5)) {
                final zf4 zf4 = new zf4(f);
                zf4.q(new String[] { m1.E0, m1.F0, "structured_location:location_picker:input" });
                zf4.B = "typeahead";
                final int a2 = w4j.a;
                zf4.U = n5;
                zf4.C = String.valueOf(d);
                saw.b((okm)zf4);
            }
        }
    }
    
    public final boolean q(final MenuItem menuItem) {
        if (menuItem.getItemId() == 2131431173) {
            if (this.X4()) {
                final ijf h = ijf.H();
                h.p((Object)this.m5(this.u1.getText().toString(), 2131954461));
                h.p((Object)this.m5(super.g1.getText().toString(), 2131954458));
                final String string = this.w1.getText().toString();
                final boolean g = pjr.g((CharSequence)string);
                final int n = 0;
                if (g) {
                    final int index = string.indexOf("://");
                    String text;
                    if (index != -1) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append(string.substring(0, index).toLowerCase(Locale.ENGLISH));
                        sb.append(string.substring(index));
                        text = sb.toString();
                    }
                    else {
                        text = l7k.c("http://", string);
                    }
                    if (!aam.f.matcher(text).matches()) {
                        h.p((Object)((x9)this).H4(2131954464));
                    }
                    else {
                        ((TextView)this.w1).setText((CharSequence)text);
                    }
                }
                final d7g m1 = this.M1;
                final int length = ((TextView)this.B1).length();
                if (m1.J0 == null && length > 30) {
                    h.p((Object)((x9)this).H4(2131954460));
                }
                if (!h.isEmpty()) {
                    final bft y1 = this.Y1;
                    final String h2 = pjr.h((CharSequence)"\n", (Iterable)h);
                    int n2 = n;
                    if (h.size() > 1) {
                        n2 = 1;
                    }
                    y1.e((CharSequence)h2, n2);
                    return true;
                }
                if (w4j.a((Object)this.K1, (Object)this.L1) ^ true) {
                    final ona l1 = this.L1;
                    if (l1 != null && l1.a()) {
                        final ona l2 = this.L1;
                        final String b = a02.b(l2.b, l2.c, l2.d);
                        final xil$b xil$b = new xil$b(2);
                        ((xil$a)xil$b).H(2131953689);
                        ((xil$a)xil$b).B((CharSequence)((x9)this).L0.getString(2131953688, new Object[] { b }));
                        ((xil$a)xil$b).F(2131953691);
                        ((xil$a)xil$b).C(2131952375);
                        final cl1 w = ((dl1$a)xil$b).w();
                        w.T1 = (mw8)new at9((Object)this, 0);
                        final int a = w4j.a;
                        w.l2(((x9)this).I4());
                        return true;
                    }
                }
                this.f5();
            }
            else {
                ((x9)this).D4();
            }
        }
        return true;
    }
    
    public final void q5(final View view) {
        final int dimensionPixelSize = ((x9)this).L0.getDimensionPixelSize(2131167445);
        view.setPadding(view.getPaddingStart(), dimensionPixelSize, view.getPaddingEnd(), dimensionPixelSize);
    }
    
    public final void r1() {
        final PopupEditText b1 = this.B1;
        if (!b1.x1) {
            b1.k();
        }
    }
    
    public final void r5(String s, String c0, final jeu jeu, final String s2, final String s3, final vdv vdv, final kju kju) {
        this.H1 = s;
        ((TextView)this.u1).setText((CharSequence)s);
        this.I1 = c0;
        ((TextView)this.v1).setText((CharSequence)c0);
        if (jeu == null) {
            c0 = null;
        }
        else if (hr4.s((Iterable)jeu.H0.a)) {
            c0 = ((xwm)jeu).C0;
        }
        else {
            s = ((xwm)jeu).C0;
            final Iterator iterator = jeu.H0.a.iterator();
            int n = 0;
            while (true) {
                c0 = s;
                if (!iterator.hasNext()) {
                    break;
                }
                final w5w w5w = iterator.next();
                s = s.replaceFirst(s.substring(((xwm)jeu).c((xes)w5w) + n, ((xwm)jeu).a((xes)w5w) + n), w5w.I0);
                n += w5w.I0.length() - (((xwm)jeu).a((xes)w5w) - ((xwm)jeu).c((xes)w5w));
            }
        }
        super.h1 = c0;
        ((TextView)super.g1).setText((CharSequence)c0);
        s = s2;
        if (kju != null) {
            s = s2;
            if (!kju.a.isEmpty()) {
                s = ((w5w)kju.a.g()).I0;
            }
        }
        ((TextView)this.w1).setText((CharSequence)s);
        this.G1 = s;
        final d7g m1 = this.M1;
        m1.K0 = s3;
        if (this.N1 == null) {
            this.N1 = new a7g(vdv, vdv);
        }
        final a7g n2 = this.N1;
        Objects.requireNonNull(m1);
        m1.I0 = n2.C0;
        m1.J0 = n2.D0;
        ((TextView)this.B1).setText((CharSequence)s3);
    }
    
    public final void s5() {
        ona ona;
        if ((ona = this.L1) == null) {
            ona = this.K1;
        }
        final xn6<EditBirthdateArgs, EditBirthdateContentViewResult> t1 = this.T1;
        final hfv d1 = super.d1;
        t1.d(new EditBirthdateArgs(ona, d1.L1, d1.M0));
        this.g5(super.d1.f(), new String[] { zf4.E(super.W0, "", "birthday", "click") });
    }
    
    public final void t1(final int n) {
        this.M1.e(n, this.n5(), super.d1.f(), super.X0.d());
        final vdv j0 = this.M1.J0;
        final PopupEditText b1 = this.B1;
        String c;
        if (j0 != null) {
            c = j0.c;
        }
        else {
            c = "";
        }
        ((TextView)b1).setText((CharSequence)c);
        final View focusSearch = ((View)this.B1).focusSearch(130);
        if (focusSearch != null) {
            focusSearch.requestFocus();
        }
    }
    
    public final void t5() {
        final String a = hct.a((Context)((x9)this).D0, 2131958843);
        final String a2 = hct.a((Context)((x9)this).D0, 2131958842);
        final fhw fhw = new fhw((Context)((x9)this).D0, ((x9)this).J0);
        final UserIdentifier j0 = ((x9)this).J0;
        Objects.requireNonNull(qbt.Companion);
        zzd.f((Object)j0, "userIdentifier");
        f.j(n9q.t((Callable)new hid((Object)fhw, (Object)j0, 2)).I(yvo.c()).P(), (u93)new zs9(this, a, a2), (raa)this.X1);
    }
}
