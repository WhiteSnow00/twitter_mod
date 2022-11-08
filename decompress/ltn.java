import androidx.activity.ComponentActivity;
import android.content.Intent;
import android.app.Activity;
import android.content.Context;
import androidx.appcompat.widget.SwitchCompat;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ltn implements okx<mtn, o5o, m5o>
{
    public static final c Companion;
    public final View C0;
    public final yl1 D0;
    public final TextView E0;
    public final SwitchCompat F0;
    public final View G0;
    public final View H0;
    public final SwitchCompat I0;
    public final zml<oyv> J0;
    
    static {
        Companion = new c();
    }
    
    public ltn(View viewById, final ibm ibm, final yl1 d0, final pca<bo> pca, final pca<q6k> pca2) {
        zzd.f((Object)viewById, "rootView");
        zzd.f((Object)ibm, "releaseCompletable");
        zzd.f((Object)d0, "baseFragmentActivity");
        zzd.f((Object)pca, "activityResultObservable");
        zzd.f((Object)pca2, "permissionResultObservable");
        this.C0 = viewById;
        this.D0 = d0;
        final View viewById2 = viewById.findViewById(2131431095);
        zzd.e((Object)viewById2, "rootView.findViewById(R.\u2026settings_mic_description)");
        this.E0 = (TextView)viewById2;
        final View viewById3 = viewById.findViewById(2131431097);
        zzd.e((Object)viewById3, "rootView.findViewById(R.\u2026room_settings_mic_switch)");
        final SwitchCompat f0 = (SwitchCompat)viewById3;
        this.F0 = f0;
        final View viewById4 = viewById.findViewById(2131431098);
        zzd.e((Object)viewById4, "rootView.findViewById(R.\u2026ings_mic_switch_disabled)");
        this.G0 = viewById4;
        final View viewById5 = viewById.findViewById(2131431092);
        zzd.e((Object)viewById5, "rootView.findViewById(R.id.room_settings_app_info)");
        this.H0 = viewById5;
        viewById = viewById.findViewById(2131431109);
        zzd.e((Object)viewById, "rootView.findViewById(R.\u2026ngs_transcription_switch)");
        this.I0 = (SwitchCompat)viewById;
        this.J0 = (zml<oyv>)new zml();
        ro.b((pca)pca, 101, (rtb)new ltn$a(this));
        r6k.c(pca2, new int[] { 100 }, (rtb<? super q6k, oyv>)new ltn$b(this));
        this.a();
        final b5j q = asy.q((View)f0);
        final m29 m29 = new m29();
        ((raa)ibm).d().q((rj)new ltn$d(m29));
        m29.c(q.subscribe((fk6)new f$c3((rtb)new ltn$e(this))));
    }
    
    public final void T(final oax oax) {
        zzd.f((Object)oax, "state");
    }
    
    public final void a() {
        int n;
        if (eo6.a((Context)this.D0, "android.permission.RECORD_AUDIO") == 0) {
            n = 1;
        }
        else if (y6k.d().j((Activity)this.D0, new String[] { "android.permission.RECORD_AUDIO" })) {
            n = 2;
        }
        else {
            n = 3;
        }
        if (n != 1) {
            if (n != 2) {
                this.F0.setChecked(false);
                ((View)this.F0).setEnabled(false);
                this.G0.setVisibility(8);
                this.H0.setVisibility(0);
                ((View)this.F0).setVisibility(8);
                this.E0.setText(2131958357);
                this.E0.setTextColor(eo6.b(this.C0.getContext(), 2131099729));
            }
            else {
                this.F0.setChecked(false);
                ((View)this.F0).setEnabled(true);
                this.G0.setVisibility(8);
                this.H0.setVisibility(8);
                ((View)this.F0).setVisibility(0);
                this.E0.setText(2131958356);
                this.E0.setTextColor(eo6.b(this.C0.getContext(), 2131100456));
            }
        }
        else {
            this.F0.setChecked(true);
            this.G0.setVisibility(0);
            ((View)this.F0).setVisibility(0);
            this.H0.setVisibility(8);
            this.E0.setText(2131958356);
            this.E0.setTextColor(eo6.b(this.C0.getContext(), 2131100456));
            this.J0.onNext((Object)oyv.a);
        }
    }
    
    public final void s(final Object o) {
        final m5o m5o = (m5o)o;
        zzd.f((Object)m5o, "effect");
        if (m5o instanceof m5o$a) {
            final Intent c = y6k.c((Context)this.D0);
            zzd.e((Object)c, "getAppInfoIntent(baseFragmentActivity)");
            ((ComponentActivity)this.D0).startActivityForResult(c, 101);
        }
    }
    
    public final b5j<o5o> x() {
        final b5j mergeArray = b5j.mergeArray(new naj[] { (naj)asy.q((View)this.I0).map((qtb)new pxn((rtb)ltn$f.C0, 12)), (naj)asy.q(this.H0).map((qtb)new adr((rtb)ltn$g.C0, 5)), (naj)((b5j)this.J0).map((qtb)new r0n((rtb)ltn$h.C0, 18)) });
        zzd.e((Object)mergeArray, "mergeArray(\n        tran\u2026ermissionsGranted }\n    )");
        return (b5j<o5o>)mergeArray;
    }
    
    public static final class c
    {
    }
}
