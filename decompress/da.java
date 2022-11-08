import android.preference.PreferenceActivity;
import android.app.Activity;
import android.view.ViewGroup$LayoutParams;
import android.view.Menu;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.g;
import androidx.appcompat.widget.Toolbar;
import android.preference.Preference;
import android.preference.PreferenceGroup;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class da extends wnd
{
    public p9s T0;
    public UserIdentifier U0;
    public rj0 V0;
    public boolean W0;
    
    public da() {
        this.U0 = UserIdentifier.LOGGED_OUT;
    }
    
    public static boolean h(final String s, final PreferenceGroup preferenceGroup) {
        final int preferenceCount = preferenceGroup.getPreferenceCount();
        for (int i = 0; i < preferenceCount; ++i) {
            final Preference preference = preferenceGroup.getPreference(i);
            if (s.equals(preference.getKey())) {
                preferenceGroup.removePreference(preference);
                return true;
            }
        }
        for (int j = 0; j < preferenceCount; ++j) {
            final Preference preference2 = preferenceGroup.getPreference(j);
            if (preference2 instanceof PreferenceGroup && h(s, (PreferenceGroup)preference2)) {
                return true;
            }
        }
        return false;
    }
    
    public final void e() {
        final g b = ((ok0)this).b();
        final View viewById = ((Activity)this).findViewById(2131432111);
        rj0 d;
        if (!(viewById instanceof Toolbar)) {
            d = null;
        }
        else {
            d = rj0.d(b, (Toolbar)viewById);
        }
        this.V0 = d;
        if (d != null) {
            d.C(14);
        }
    }
    
    public final boolean f(final String s) {
        return h(s, (PreferenceGroup)((PreferenceActivity)this).getPreferenceScreen());
    }
    
    public final void j(final CharSequence subtitle) {
        this.V0.c.setSubtitle(subtitle);
    }
    
    public void onCreate(final Bundle bundle) {
        this.U0 = UserIdentifier.getCurrent();
        super.onCreate(bundle);
        if (bundle != null) {
            this.W0 = bundle.getBoolean("screen_checked");
        }
        this.T0 = ((y5f)p88.b((mec)this, (Class)y5f.class)).c5();
        this.setContentView(2131625196);
    }
    
    public final boolean onCreateOptionsMenu(final Menu menu) {
        this.V0.L((cbi)new ca(this));
        ((View)this.V0.c).setVisibility(0);
        return super.onCreateOptionsMenu(menu);
    }
    
    public final void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("screen_checked", this.W0);
    }
    
    public final void onTitleChanged(final CharSequence title, final int n) {
        final rj0 v0 = this.V0;
        if (v0 != null) {
            v0.c.setTitle(title);
        }
        else {
            super.onTitleChanged(title, n);
        }
    }
    
    public final void setContentView(final int contentView) {
        super.setContentView(contentView);
        this.e();
    }
    
    public final void setContentView(final View contentView) {
        super.setContentView(contentView);
        this.e();
    }
    
    public final void setContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        super.setContentView(view, viewGroup$LayoutParams);
        this.e();
    }
}
