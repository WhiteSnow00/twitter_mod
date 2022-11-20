import android.widget.TextView;
import android.view.View;
import android.preference.Preference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dth extends Preference
{
    public static void b(View viewById) {
        viewById = viewById.findViewById(16908310);
        if (viewById instanceof TextView) {
            ((TextView)viewById).setSingleLine(false);
        }
    }
}
