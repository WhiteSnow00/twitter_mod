import android.widget.CompoundButton;
import android.widget.AdapterView;
import java.util.Iterator;
import java.util.List;
import android.media.RingtoneManager;
import android.os.Parcelable;
import android.net.Uri;
import android.content.Intent;
import com.twitter.app.common.args.ContentViewArgs;
import com.twitter.notifications.settings.tweet.TweetSettingsContentViewArgs;
import android.widget.CheckBox;
import android.widget.SpinnerAdapter;
import android.widget.AdapterView$OnItemSelectedListener;
import java.util.Collection;
import java.util.Map;
import android.util.SparseArray;
import java.util.ArrayList;
import android.widget.Spinner;
import com.twitter.util.InvalidDataException;
import java.util.Objects;
import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vxi implements View$OnClickListener
{
    public final wxi D0;
    public final int E0;
    
    public vxi(final wxi d0, final int e0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final void onClick(final View view) {
        final wxi d0 = this.D0;
        final int e0 = this.E0;
        final unp l0 = d0.L0;
        final uui uui = (uui)((h3e)d0).G0.getItem(e0);
        Objects.requireNonNull(l0);
        if (!(uui instanceof oui)) {
            final nui nui = (nui)uui;
            final nqp$c a = nui.a;
            final String g = a.g;
            Objects.requireNonNull(g);
            g.hashCode();
            final int n = 0;
            int n2 = -1;
            switch (g) {
                case "list": {
                    n2 = 3;
                    break;
                }
                case "on_off": {
                    n2 = 2;
                    break;
                }
                case "tweet_control": {
                    n2 = 1;
                    break;
                }
                case "ringtone": {
                    n2 = 0;
                    break;
                }
                default:
                    break;
            }
            switch (n2) {
                default: {
                    m8a.c(new h8a((Throwable)new InvalidDataException("Unsupported control type found while handling setting item click")));
                    break;
                }
                case 3: {
                    final Spinner spinner = (Spinner)view.findViewById(2131431672);
                    final ybq c = l0.c;
                    c.c.clear();
                    final List h = a.h;
                    final ArrayList list = new ArrayList<String>(h.size());
                    final SparseArray sparseArray = new SparseArray();
                    final Iterator iterator = h.iterator();
                    int n3 = 0;
                    while (iterator.hasNext()) {
                        final Map map = (Map)iterator.next();
                        if (map.size() == 1) {
                            final Iterator iterator2 = map.entrySet().iterator();
                            int n4 = n3;
                            while (true) {
                                n3 = n4;
                                if (!iterator2.hasNext()) {
                                    break;
                                }
                                final Map.Entry<String, V> entry = (Map.Entry<String, V>)iterator2.next();
                                sparseArray.append(n4, (Object)entry.getKey());
                                list.add((String)entry.getValue());
                                ++n4;
                            }
                        }
                        else {
                            mw.B("selection is more than one");
                        }
                    }
                    if (!ikr.e((CharSequence)c.d)) {
                        sparseArray.append(n3, (Object)"off");
                        list.add(c.d);
                    }
                    c.c.addAll((Collection)list);
                    ((AdapterView)spinner).setOnItemSelectedListener((AdapterView$OnItemSelectedListener)new ybq$a(c.b, nui, c.a, sparseArray, e0));
                    spinner.setAdapter((SpinnerAdapter)c.c);
                    for (int i = n; i < sparseArray.size(); ++i) {
                        if (czd.a((Object)sparseArray.get(i), (Object)nui.b)) {
                            ((AdapterView)spinner).setSelection(i);
                        }
                    }
                    spinner.performClick();
                    break;
                }
                case 2: {
                    final CheckBox checkBox = (CheckBox)view.findViewById(2131431378);
                    ((CompoundButton)checkBox).toggle();
                    final String n5 = xli.N(((CompoundButton)checkBox).isChecked());
                    l0.a.c(a.a, n5);
                    nui.b = n5;
                    l0.b.g(e0);
                    break;
                }
                case 1: {
                    l0.e.b((ContentViewArgs)new TweetSettingsContentViewArgs());
                    break;
                }
                case 0: {
                    final Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                    final String b = nui.b;
                    if (!ikr.e((CharSequence)b)) {
                        intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", (Parcelable)Uri.parse(b));
                    }
                    intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                    intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", (Parcelable)RingtoneManager.getDefaultUri(2));
                    intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                    intent.putExtra("android.intent.extra.ringtone.TYPE", 2);
                    l0.d.startActivityForResult(intent, 2);
                    break;
                }
            }
        }
    }
}
