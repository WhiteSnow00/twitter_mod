import androidx.fragment.app.Fragment;
import android.widget.RadioButton;
import android.widget.RadioGroup$OnCheckedChangeListener;
import android.widget.RadioGroup;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import kotlin.Metadata;

// 
// Decompiled by Procyon v0.6.0
// 

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005" }, d2 = { "Lo3x;", "Le92;", "<init>", "()V", "a", "feature.tfa.gallery.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class o3x extends e92
{
    public static final o3x.o3x$a Companion;
    public static final String p2;
    public final mcq<umk> o2;
    
    static {
        Companion = new o3x.o3x$a();
        p2 = o3x.class.getSimpleName();
    }
    
    public o3x() {
        this.o2 = (mcq<umk>)new mcq();
    }
    
    public final View m1(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        czd.f((Object)layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131625987, viewGroup, false);
        final Bundle j0 = ((Fragment)this).J0;
        Object o = null;
        Object serializable;
        if (j0 != null) {
            serializable = j0.getSerializable("CURRENT_SPEED");
        }
        else {
            serializable = null;
        }
        if (serializable instanceof umk) {
            o = serializable;
        }
        Object h0;
        if ((h0 = o) == null) {
            h0 = umk.H0;
        }
        final RadioGroup radioGroup = (RadioGroup)inflate.findViewById(2131430608);
        this.n2(inflate, 2131430603);
        final String k = asa.b().k("android_variable_playback_speed_option");
        czd.e((Object)k, "getCurrent()\n           \u2026LE_PLAYBACK_SPEED_OPTION)");
        int n = 4;
        if (!czd.a((Object)k, (Object)"all")) {
            if (czd.a((Object)k, (Object)"slow")) {
                n = 2;
            }
            else if (czd.a((Object)k, (Object)"fast")) {
                n = 3;
            }
            else {
                n = 1;
            }
        }
        final int e = ib0.E(n);
        if (e != 1) {
            if (e != 2) {
                if (e == 3) {
                    this.n2(inflate, 2131430600);
                    this.n2(inflate, 2131430601);
                    this.n2(inflate, 2131430602);
                    this.n2(inflate, 2131430604);
                    this.n2(inflate, 2131430605);
                    this.n2(inflate, 2131430606);
                    this.n2(inflate, 2131430607);
                }
            }
            else {
                this.n2(inflate, 2131430604);
                this.n2(inflate, 2131430605);
                this.n2(inflate, 2131430606);
                this.n2(inflate, 2131430607);
            }
        }
        else {
            this.n2(inflate, 2131430600);
            this.n2(inflate, 2131430601);
            this.n2(inflate, 2131430602);
        }
        switch (((Enum)h0).ordinal()) {
            case 7: {
                radioGroup.check(2131430607);
                break;
            }
            case 6: {
                radioGroup.check(2131430606);
                break;
            }
            case 5: {
                radioGroup.check(2131430605);
                break;
            }
            case 4: {
                radioGroup.check(2131430604);
                break;
            }
            case 3: {
                radioGroup.check(2131430603);
                break;
            }
            case 2: {
                radioGroup.check(2131430602);
                break;
            }
            case 1: {
                radioGroup.check(2131430601);
                break;
            }
            case 0: {
                radioGroup.check(2131430600);
                break;
            }
        }
        radioGroup.setOnCheckedChangeListener((RadioGroup$OnCheckedChangeListener)new n3x(this));
        return inflate;
    }
    
    public final void n2(final View view, final int n) {
        ((View)view.findViewById(n)).setVisibility(0);
    }
}
