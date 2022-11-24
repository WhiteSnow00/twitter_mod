import android.app.Notification$Style;
import android.text.style.TextAppearanceSpan;
import android.content.res.ColorStateList;
import android.app.Notification$Builder;
import java.util.Iterator;
import android.app.Notification$BigTextStyle;
import android.text.SpannableStringBuilder;
import android.app.Notification$MessagingStyle;
import java.util.Objects;
import android.os.Build$VERSION;
import android.os.Parcelable;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kri extends lri
{
    public final List<kri.kri$a> e;
    public final List<kri.kri$a> f;
    public vbk g;
    public CharSequence h;
    public Boolean i;
    
    public kri(final vbk g) {
        this.e = new ArrayList();
        this.f = new ArrayList();
        if (!TextUtils.isEmpty(g.a)) {
            this.g = g;
            return;
        }
        throw new IllegalArgumentException("User's name must not be empty.");
    }
    
    @Override
    public final void a(final Bundle bundle) {
        super.a(bundle);
        bundle.putCharSequence("android.selfDisplayName", this.g.a);
        bundle.putBundle("android.messagingStyleUser", this.g.a());
        bundle.putCharSequence("android.hiddenConversationTitle", this.h);
        if (this.h != null && this.i) {
            bundle.putCharSequence("android.conversationTitle", this.h);
        }
        if (!this.e.isEmpty()) {
            bundle.putParcelableArray("android.messages", (Parcelable[])kri.kri$a.a((List)this.e));
        }
        if (!this.f.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", (Parcelable[])kri.kri$a.a((List)this.f));
        }
        final Boolean i = this.i;
        if (i != null) {
            bundle.putBoolean("android.isGroupConversation", (boolean)i);
        }
    }
    
    @Override
    public final void b(final jqi jqi) {
        final gri a = super.a;
        boolean booleanValue = false;
        Label_0071: {
            if (a != null && a.a.getApplicationInfo().targetSdkVersion < 28 && this.i == null) {
                if (this.h != null) {
                    booleanValue = true;
                    break Label_0071;
                }
            }
            else {
                final Boolean i = this.i;
                if (i != null) {
                    booleanValue = i;
                    break Label_0071;
                }
            }
            booleanValue = false;
        }
        this.i = booleanValue;
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 24) {
            Notification$MessagingStyle notification$MessagingStyle;
            if (sdk_INT >= 28) {
                final vbk g = this.g;
                Objects.requireNonNull(g);
                notification$MessagingStyle = new Notification$MessagingStyle(vbk.b.b(g));
            }
            else {
                notification$MessagingStyle = new Notification$MessagingStyle(this.g.a);
            }
            final Iterator iterator = this.e.iterator();
            while (iterator.hasNext()) {
                notification$MessagingStyle.addMessage(((kri.kri$a)iterator.next()).b());
            }
            if (Build$VERSION.SDK_INT >= 26) {
                final Iterator iterator2 = this.f.iterator();
                while (iterator2.hasNext()) {
                    notification$MessagingStyle.addHistoricMessage(((kri.kri$a)iterator2.next()).b());
                }
            }
            if (this.i || Build$VERSION.SDK_INT >= 28) {
                notification$MessagingStyle.setConversationTitle(this.h);
            }
            if (Build$VERSION.SDK_INT >= 28) {
                notification$MessagingStyle.setGroupConversation((boolean)this.i);
            }
            ((Notification$Style)notification$MessagingStyle).setBuilder(((mri)jqi).b);
        }
        else {
            int size = this.e.size();
            kri.kri$a kri$a;
            while (true) {
                final int n = size - 1;
                if (n >= 0) {
                    kri$a = this.e.get(n);
                    final vbk c = kri$a.c;
                    size = n;
                    if (c == null) {
                        continue;
                    }
                    size = n;
                    if (!TextUtils.isEmpty(c.a)) {
                        break;
                    }
                    continue;
                }
                else {
                    if (!this.e.isEmpty()) {
                        final ArrayList e = this.e;
                        kri$a = (kri.kri$a)e.get(e.size() - 1);
                        break;
                    }
                    kri$a = null;
                    break;
                }
            }
            if (this.h != null && this.i) {
                ((mri)jqi).b.setContentTitle(this.h);
            }
            else if (kri$a != null) {
                final mri mri = (mri)jqi;
                mri.b.setContentTitle((CharSequence)"");
                final vbk c2 = kri$a.c;
                if (c2 != null) {
                    mri.b.setContentTitle(c2.a);
                }
            }
            if (kri$a != null) {
                final Notification$Builder b = ((mri)jqi).b;
                CharSequence contentText;
                if (this.h != null) {
                    contentText = this.k(kri$a);
                }
                else {
                    contentText = kri$a.a;
                }
                b.setContentText(contentText);
            }
            final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            boolean b3 = false;
            Label_0609: {
                Label_0607: {
                    if (this.h == null) {
                        int j = this.e.size() - 1;
                        while (true) {
                            while (j >= 0) {
                                final vbk c3 = this.e.get(j).c;
                                if (c3 != null && c3.a == null) {
                                    final boolean b2 = true;
                                    if (b2) {
                                        break Label_0607;
                                    }
                                    b3 = false;
                                    break Label_0609;
                                }
                                else {
                                    --j;
                                }
                            }
                            final boolean b2 = false;
                            continue;
                        }
                    }
                }
                b3 = true;
            }
            for (int k = this.e.size() - 1; k >= 0; --k) {
                final kri.kri$a kri$a2 = this.e.get(k);
                CharSequence charSequence;
                if (b3) {
                    charSequence = this.k(kri$a2);
                }
                else {
                    charSequence = kri$a2.a;
                }
                if (k != this.e.size() - 1) {
                    spannableStringBuilder.insert(0, (CharSequence)"\n");
                }
                spannableStringBuilder.insert(0, charSequence);
            }
            new Notification$BigTextStyle(((mri)jqi).b).setBigContentTitle((CharSequence)null).bigText((CharSequence)spannableStringBuilder);
        }
    }
    
    @Override
    public final String f() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }
    
    public final CharSequence k(final kri.kri$a kri$a) {
        final kw1 c = kw1.c();
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        final int n = -16777216;
        final vbk c2 = kri$a.c;
        final String s = "";
        CharSequence a;
        if (c2 == null) {
            a = "";
        }
        else {
            a = c2.a;
        }
        int n2 = n;
        CharSequence charSequence = a;
        if (TextUtils.isEmpty(a)) {
            final CharSequence a2 = this.g.a;
            final int x = super.a.x;
            n2 = n;
            charSequence = a2;
            if (x != 0) {
                n2 = x;
                charSequence = a2;
            }
        }
        final CharSequence d = c.d(charSequence);
        spannableStringBuilder.append(d);
        spannableStringBuilder.setSpan((Object)new TextAppearanceSpan((String)null, 0, 0, ColorStateList.valueOf(n2), (ColorStateList)null), spannableStringBuilder.length() - ((SpannableStringBuilder)d).length(), spannableStringBuilder.length(), 33);
        CharSequence a3 = kri$a.a;
        if (a3 == null) {
            a3 = s;
        }
        spannableStringBuilder.append((CharSequence)"  ").append(c.d(a3));
        return (CharSequence)spannableStringBuilder;
    }
}
