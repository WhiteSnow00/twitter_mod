import java.util.List;
import android.os.BaseBundle;
import org.json.JSONException;
import com.android.billingclient.api.Purchase;
import android.util.Log;
import android.content.Intent;
import android.text.TextUtils;
import java.util.ArrayList;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f8y
{
    public static final int a;
    
    static {
        a = Runtime.getRuntime().availableProcessors();
    }
    
    public static int a(final Bundle bundle, final String s) {
        if (bundle == null) {
            f(s, "Unexpected null bundle received!");
            return 6;
        }
        final Object value = ((BaseBundle)bundle).get("RESPONSE_CODE");
        if (value == null) {
            e(s, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (value instanceof Integer) {
            return (int)value;
        }
        final String name = ((Integer)value).getClass().getName();
        String concat;
        if (name.length() != 0) {
            concat = "Unexpected type for bundle response code: ".concat(name);
        }
        else {
            concat = new String("Unexpected type for bundle response code: ");
        }
        f(s, concat);
        return 6;
    }
    
    public static Bundle b(int i, final boolean b, final String s, final String s2, final ArrayList<rey> list) {
        final Bundle bundle = new Bundle();
        if (i >= 9) {
            ((BaseBundle)bundle).putString("playBillingLibraryVersion", s);
        }
        if (i >= 9 && b) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (i >= 14) {
            final ArrayList list2 = new ArrayList();
            final int size = ((List)s2).size();
            i = 0;
            boolean b2 = false;
            while (i < size) {
                final rey rey = ((List<rey>)s2).get(i);
                list2.add(null);
                b2 |= (TextUtils.isEmpty((CharSequence)null) ^ true);
                ++i;
            }
            if (b2) {
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", list2);
            }
        }
        return bundle;
    }
    
    public static sx1 c(final Intent intent, final String s) {
        if (intent == null) {
            f("BillingHelper", "Got null intent!");
            final sx1 sx1 = new sx1();
            sx1.a = 6;
            sx1.b = "An internal error occurred.";
            return sx1;
        }
        final int a = a(intent.getExtras(), s);
        final String d = d(intent.getExtras(), s);
        final sx1 sx2 = new sx1();
        sx2.a = a;
        sx2.b = d;
        return sx2;
    }
    
    public static String d(final Bundle bundle, final String s) {
        if (bundle == null) {
            f(s, "Unexpected null bundle received!");
            return "";
        }
        final Object value = ((BaseBundle)bundle).get("DEBUG_MESSAGE");
        if (value == null) {
            e(s, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (value instanceof String) {
            return (String)value;
        }
        final String name = ((String)value).getClass().getName();
        String concat;
        if (name.length() != 0) {
            concat = "Unexpected type for debug message: ".concat(name);
        }
        else {
            concat = new String("Unexpected type for debug message: ");
        }
        f(s, concat);
        return "";
    }
    
    public static void e(final String s, final String s2) {
        if (Log.isLoggable(s, 2)) {
            Log.v(s, s2);
        }
    }
    
    public static void f(final String s, final String s2) {
        if (Log.isLoggable(s, 5)) {
            Log.w(s, s2);
        }
    }
    
    public static Purchase g(final String s, String value) {
        final Purchase purchase = null;
        if (s != null && value != null) {
            Purchase purchase2;
            try {
                purchase2 = new Purchase(s, value);
            }
            catch (final JSONException ex) {
                value = String.valueOf(ex);
                final StringBuilder sb = new StringBuilder(value.length() + 47);
                sb.append("Got JSONException while parsing purchase data: ");
                sb.append(value);
                f("BillingHelper", sb.toString());
                purchase2 = purchase;
            }
            return purchase2;
        }
        f("BillingHelper", "Received a bad purchase data.");
        return null;
    }
}
