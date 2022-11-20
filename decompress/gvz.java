import android.os.BaseBundle;
import org.json.JSONException;
import com.android.billingclient.api.SkuDetails;
import android.os.Bundle;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Objects;
import java.util.List;
import com.android.billingclient.api.b;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gvz implements Callable
{
    public final b D0;
    public final String E0;
    public final List F0;
    public final aeq G0;
    
    public gvz(final b d0, final String e0, final List f0, final aeq g0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    @Override
    public final Object call() {
        final b d0 = this.D0;
        final String e0 = this.E0;
        final List f0 = this.F0;
        final aeq g0 = this.G0;
        Objects.requireNonNull(d0);
        ArrayList list = new ArrayList();
        final int size = f0.size();
        int i = 0;
    Label_0567:
        while (true) {
            while (i < size) {
                final int n = i + 20;
                int n2;
                if (n > size) {
                    n2 = size;
                }
                else {
                    n2 = n;
                }
                final ArrayList list2 = new ArrayList(f0.subList(i, n2));
                final ArrayList<String> list3 = new ArrayList<String>();
                for (int size2 = list2.size(), j = 0; j < size2; ++j) {
                    list3.add(((gfy)list2.get(j)).a);
                }
                final Bundle bundle = new Bundle();
                bundle.putStringArrayList("ITEM_ID_LIST", (ArrayList)list3);
                ((BaseBundle)bundle).putString("playBillingLibraryVersion", d0.b);
                int a;
                String d2;
                try {
                    Bundle bundle2;
                    if (d0.l) {
                        bundle2 = d0.f.E1(d0.e.getPackageName(), e0, bundle, v8y.b(d0.i, d0.p, d0.b, list2));
                    }
                    else {
                        bundle2 = d0.f.j1(d0.e.getPackageName(), e0, bundle);
                    }
                    Label_0364: {
                        if (bundle2 != null) {
                            Label_0486: {
                                if (!((BaseBundle)bundle2).containsKey("DETAILS_LIST")) {
                                    a = v8y.a(bundle2, "BillingClient");
                                    d2 = v8y.d(bundle2, "BillingClient");
                                    if (a != 0) {
                                        final StringBuilder sb = new StringBuilder(50);
                                        sb.append("getSkuDetails() failed. Response code: ");
                                        sb.append(a);
                                        v8y.f("BillingClient", sb.toString());
                                        break Label_0567;
                                    }
                                    v8y.f("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a detail list.");
                                }
                                else {
                                    final ArrayList stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                                    if (stringArrayList == null) {
                                        v8y.f("BillingClient", "querySkuDetailsAsync got null response list");
                                        break Label_0364;
                                    }
                                    int k = 0;
                                    while (k < stringArrayList.size()) {
                                        final String s = stringArrayList.get(k);
                                        try {
                                            final SkuDetails skuDetails = new SkuDetails(s);
                                            final String value = String.valueOf(skuDetails);
                                            final StringBuilder sb2 = new StringBuilder(value.length() + 17);
                                            sb2.append("Got sku details: ");
                                            sb2.append(value);
                                            v8y.e("BillingClient", sb2.toString());
                                            list.add(skuDetails);
                                            ++k;
                                            continue;
                                        }
                                        catch (final JSONException ex) {
                                            v8y.f("BillingClient", "Got a JSON exception trying to decode SkuDetails.");
                                            d2 = "Error trying to decode SkuDetails.";
                                            list = null;
                                        }
                                        break Label_0486;
                                    }
                                    i = n;
                                    continue;
                                }
                            }
                            a = 6;
                            break Label_0567;
                        }
                        v8y.f("BillingClient", "querySkuDetailsAsync got null sku details list");
                    }
                    d2 = "Item is unavailable for purchase.";
                    a = 4;
                }
                catch (final Exception ex2) {
                    final String value2 = String.valueOf(ex2);
                    final StringBuilder sb3 = new StringBuilder(value2.length() + 63);
                    sb3.append("querySkuDetailsAsync got a remote exception (try to reconnect).");
                    sb3.append(value2);
                    v8y.f("BillingClient", sb3.toString());
                    d2 = "Service connection is disconnected.";
                    a = -1;
                }
                list = null;
                final nx1 nx1 = new nx1();
                nx1.a = a;
                nx1.b = d2;
                g0.a(nx1, (List)list);
                return null;
            }
            String d2 = "";
            int a = 0;
            continue Label_0567;
        }
    }
}
