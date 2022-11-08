import com.twitter.ui.user.UserView;
import android.widget.ImageView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import com.twitter.util.user.UserIdentifier;
import android.widget.ArrayAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mj extends ArrayAdapter<hfv>
{
    public final UserIdentifier C0;
    
    public mj(final Context context, final hfv[] array, final UserIdentifier c0) {
        super(context, 0, (Object[])array);
        this.C0 = c0;
    }
    
    public final View getView(final int n, final View view, final ViewGroup viewGroup) {
        View inflate;
        ImageView tag;
        if (view == null) {
            inflate = LayoutInflater.from(this.getContext()).inflate(2131623970, viewGroup, false);
            tag = (ImageView)inflate.findViewById(2131428221);
            inflate.setTag((Object)tag);
        }
        else {
            tag = (ImageView)view.getTag();
            inflate = view;
        }
        final UserView userView = (UserView)inflate;
        final hfv user = (hfv)this.getItem(n);
        if (user != null) {
            userView.setUser(user);
            final String l = pjr.l(user.J0);
            String contentDescription;
            if (user.f().equals((Object)this.C0)) {
                tag.setVisibility(0);
                if (pjr.g((CharSequence)user.c())) {
                    contentDescription = this.getContext().getString(2131957536, new Object[] { user.c(), l });
                }
                else {
                    contentDescription = this.getContext().getString(2131957537, new Object[] { l });
                }
            }
            else {
                if (pjr.g((CharSequence)user.c())) {
                    contentDescription = this.getContext().getString(2131951787, new Object[] { user.c(), l });
                }
                else {
                    contentDescription = this.getContext().getString(2131951788, new Object[] { l });
                }
                tag.setVisibility(4);
            }
            ((View)userView).setContentDescription((CharSequence)contentDescription);
        }
        else {
            userView.setUser((hfv)null);
            ((View)userView).setContentDescription((CharSequence)null);
        }
        return inflate;
    }
}
