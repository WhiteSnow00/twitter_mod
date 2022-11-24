import android.os.BaseBundle;
import java.util.WeakHashMap;
import android.text.Spanned;
import java.util.ArrayList;
import android.os.Build$VERSION;
import android.view.accessibility.AccessibilityNodeInfo;
import android.text.style.ClickableSpan;
import java.lang.ref.WeakReference;
import android.util.SparseArray;
import android.util.Log;
import java.util.Objects;
import java.util.Collections;
import java.util.List;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.accessibility.AccessibilityEvent;
import android.view.View;
import android.view.View$AccessibilityDelegate;

// 
// Decompiled by Procyon v0.6.0
// 

public class wf
{
    public static final View$AccessibilityDelegate c;
    public final View$AccessibilityDelegate a;
    public final a b;
    
    static {
        c = new View$AccessibilityDelegate();
    }
    
    public wf() {
        this(wf.c);
    }
    
    public wf(final View$AccessibilityDelegate a) {
        this.a = a;
        this.b = new a(this);
    }
    
    public boolean a(final View view, final AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }
    
    public pg b(final View view) {
        final AccessibilityNodeProvider a = wf.b.a(this.a, view);
        if (a != null) {
            return new pg(a);
        }
        return null;
    }
    
    public void c(final View view, final AccessibilityEvent accessibilityEvent) {
        this.a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }
    
    public void d(final View view, final ng ng) {
        this.a.onInitializeAccessibilityNodeInfo(view, ng.a);
    }
    
    public void e(final View view, final AccessibilityEvent accessibilityEvent) {
        this.a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }
    
    public boolean f(final ViewGroup viewGroup, final View view, final AccessibilityEvent accessibilityEvent) {
        return this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }
    
    public boolean g(final View view, int int1, final Bundle bundle) {
        List<Object> emptyList;
        if ((emptyList = (List)view.getTag(2131431884)) == null) {
            emptyList = Collections.emptyList();
        }
        final boolean b = false;
        int i = 0;
        while (true) {
            while (i < emptyList.size()) {
                final ng$a ng$a = emptyList.get(i);
                if (ng$a.a() == int1) {
                    if (ng$a.d != null) {
                        final Class c = ng$a.c;
                        if (c != null) {
                            try {
                                Objects.requireNonNull((Object)c.getDeclaredConstructor((Class[])new Class[0]).newInstance(new Object[0]));
                            }
                            catch (final Exception ex) {
                                final Class c2 = ng$a.c;
                                String name;
                                if (c2 == null) {
                                    name = "null";
                                }
                                else {
                                    name = c2.getName();
                                }
                                final StringBuilder sb = new StringBuilder();
                                sb.append("Failed to execute command with argument class ViewCommandArgument: ");
                                sb.append(name);
                                Log.e("A11yActionCompat", sb.toString(), (Throwable)ex);
                            }
                        }
                        final int k = ng$a.d.k(view) ? 1 : 0;
                        int b2 = k;
                        if (k == 0) {
                            b2 = (wf.b.b(this.a, view, int1, bundle) ? 1 : 0);
                        }
                        int n = b2;
                        if (b2 == 0) {
                            n = b2;
                            if (int1 == 2131427388) {
                                n = b2;
                                if (bundle != null) {
                                    int1 = ((BaseBundle)bundle).getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
                                    final SparseArray sparseArray = (SparseArray)view.getTag(2131431885);
                                    int n2 = b ? 1 : 0;
                                    if (sparseArray != null) {
                                        final WeakReference weakReference = (WeakReference)sparseArray.get(int1);
                                        n2 = (b ? 1 : 0);
                                        if (weakReference != null) {
                                            final ClickableSpan clickableSpan = (ClickableSpan)weakReference.get();
                                            Label_0355: {
                                                if (clickableSpan != null) {
                                                    ClickableSpan[] j;
                                                    for (j = ng.j(view.createAccessibilityNodeInfo().getText()), int1 = 0; j != null && int1 < j.length; ++int1) {
                                                        if (clickableSpan.equals(j[int1])) {
                                                            int1 = 1;
                                                            break Label_0355;
                                                        }
                                                    }
                                                }
                                                int1 = 0;
                                            }
                                            n2 = (b ? 1 : 0);
                                            if (int1 != 0) {
                                                clickableSpan.onClick(view);
                                                n2 = 1;
                                            }
                                        }
                                    }
                                    n = n2;
                                }
                            }
                        }
                        return n != 0;
                    }
                    break;
                }
                else {
                    ++i;
                }
            }
            final int k = false ? 1 : 0;
            continue;
        }
    }
    
    public void h(final View view, final int n) {
        this.a.sendAccessibilityEvent(view, n);
    }
    
    public void i(final View view, final AccessibilityEvent accessibilityEvent) {
        this.a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
    
    public static final class a extends View$AccessibilityDelegate
    {
        public final wf a;
        
        public a(final wf a) {
            this.a = a;
        }
        
        public final boolean dispatchPopulateAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
            return this.a.a(view, accessibilityEvent);
        }
        
        public final AccessibilityNodeProvider getAccessibilityNodeProvider(final View view) {
            final pg b = this.a.b(view);
            AccessibilityNodeProvider accessibilityNodeProvider;
            if (b != null) {
                accessibilityNodeProvider = (AccessibilityNodeProvider)b.a;
            }
            else {
                accessibilityNodeProvider = null;
            }
            return accessibilityNodeProvider;
        }
        
        public final void onInitializeAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
            this.a.c(view, accessibilityEvent);
        }
        
        public final void onInitializeAccessibilityNodeInfo(final View view, final AccessibilityNodeInfo accessibilityNodeInfo) {
            final ng ng = new ng(accessibilityNodeInfo);
            final WeakHashMap a = b7x.a;
            final int sdk_INT = Build$VERSION.SDK_INT;
            final int n = 1;
            final boolean b = sdk_INT >= 28;
            final CharSequence charSequence = null;
            Object o;
            if (b) {
                o = b7x$m.d(view);
            }
            else {
                o = view.getTag(2131431894);
                if (!Boolean.class.isInstance(o)) {
                    o = null;
                }
            }
            final Boolean b2 = (Boolean)o;
            ng.V(b2 != null && b2);
            Object o2;
            if (sdk_INT >= 28) {
                o2 = b7x$m.c(view);
            }
            else {
                o2 = view.getTag(2131431886);
                if (!Boolean.class.isInstance(o2)) {
                    o2 = null;
                }
            }
            final Boolean b3 = (Boolean)o2;
            ng.N(b3 != null && b3);
            ng.S(b7x.k(view));
            int n2;
            if (sdk_INT >= 30) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
            Object a2;
            if (n2 != 0) {
                a2 = b7x$o.a(view);
            }
            else {
                final Object tag = view.getTag(2131431896);
                a2 = charSequence;
                if (CharSequence.class.isInstance(tag)) {
                    a2 = tag;
                }
            }
            ng.Y((CharSequence)a2);
            this.a.d(view, ng);
            final CharSequence text = accessibilityNodeInfo.getText();
            if (sdk_INT < 26) {
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
                final SparseArray sparseArray = (SparseArray)view.getTag(2131431885);
                if (sparseArray != null) {
                    final ArrayList<Integer> list = new ArrayList<Integer>();
                    for (int i = 0; i < sparseArray.size(); ++i) {
                        if (((WeakReference)sparseArray.valueAt(i)).get() == null) {
                            list.add(i);
                        }
                    }
                    for (int j = 0; j < list.size(); ++j) {
                        sparseArray.remove((int)list.get(j));
                    }
                }
                final ClickableSpan[] k = ng.j(text);
                if (k != null && k.length > 0) {
                    ((BaseBundle)ng.l()).putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", 2131427388);
                    SparseArray sparseArray2;
                    if ((sparseArray2 = (SparseArray)view.getTag(2131431885)) == null) {
                        sparseArray2 = new SparseArray();
                        view.setTag(2131431885, (Object)sparseArray2);
                    }
                    int l = 0;
                Label_0501:
                    while (l < k.length) {
                        final ClickableSpan clickableSpan = k[l];
                        while (true) {
                            for (int n3 = 0; n3 < sparseArray2.size(); ++n3) {
                                if (clickableSpan.equals(((WeakReference)sparseArray2.valueAt(n3)).get())) {
                                    final int n4 = sparseArray2.keyAt(n3);
                                    sparseArray2.put(n4, (Object)new WeakReference(k[l]));
                                    final ClickableSpan clickableSpan2 = k[l];
                                    final Spanned spanned = (Spanned)text;
                                    ng.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(spanned.getSpanStart((Object)clickableSpan2));
                                    ng.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(spanned.getSpanEnd((Object)clickableSpan2));
                                    ng.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(spanned.getSpanFlags((Object)clickableSpan2));
                                    ng.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(n4);
                                    ++l;
                                    continue Label_0501;
                                }
                            }
                            final int n4 = ng.d;
                            ng.d = n4 + 1;
                            continue;
                        }
                    }
                }
            }
            List<Object> emptyList;
            if ((emptyList = (List)view.getTag(2131431884)) == null) {
                emptyList = Collections.emptyList();
            }
            for (int n5 = 0; n5 < emptyList.size(); ++n5) {
                ng.b((ng$a)emptyList.get(n5));
            }
        }
        
        public final void onPopulateAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
            this.a.e(view, accessibilityEvent);
        }
        
        public final boolean onRequestSendAccessibilityEvent(final ViewGroup viewGroup, final View view, final AccessibilityEvent accessibilityEvent) {
            return this.a.f(viewGroup, view, accessibilityEvent);
        }
        
        public final boolean performAccessibilityAction(final View view, final int n, final Bundle bundle) {
            return this.a.g(view, n, bundle);
        }
        
        public final void sendAccessibilityEvent(final View view, final int n) {
            this.a.h(view, n);
        }
        
        public final void sendAccessibilityEventUnchecked(final View view, final AccessibilityEvent accessibilityEvent) {
            this.a.i(view, accessibilityEvent);
        }
    }
    
    public static final class b
    {
        public static AccessibilityNodeProvider a(final View$AccessibilityDelegate view$AccessibilityDelegate, final View view) {
            return view$AccessibilityDelegate.getAccessibilityNodeProvider(view);
        }
        
        public static boolean b(final View$AccessibilityDelegate view$AccessibilityDelegate, final View view, final int n, final Bundle bundle) {
            return view$AccessibilityDelegate.performAccessibilityAction(view, n, bundle);
        }
    }
}
