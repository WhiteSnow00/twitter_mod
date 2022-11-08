import java.io.IOException;
import java.util.Iterator;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import android.text.Editable;
import android.telephony.PhoneNumberUtils;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import android.text.TextUtils;
import android.util.Log;
import java.util.List;
import java.util.HashMap;
import java.util.HashSet;
import java.nio.ByteBuffer;
import java.util.Map;
import com.twitter.ocf.contacts.analytics.ContactsQueryStats;
import android.database.DatabaseUtils;
import java.util.Objects;
import android.content.ContentValues;
import android.database.Cursor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cl6
{
    public final vk6 a;
    
    public cl6(final vk6 a) {
        this.a = a;
    }
    
    public final ContentValues a(final Cursor cursor, int n, final int n2) {
        final ContentValues contentValues = new ContentValues();
        final String string = cursor.getString(n);
        contentValues.put("mimetype", string);
        Objects.requireNonNull(string);
        Label_0263: {
            switch (string) {
                case "vnd.android.cursor.item/nickname": {
                    n = 7;
                    break Label_0263;
                }
                case "vnd.android.cursor.item/relation": {
                    n = 6;
                    break Label_0263;
                }
                case "vnd.android.cursor.item/photo": {
                    n = 5;
                    break Label_0263;
                }
                case "vnd.android.cursor.item/phone_v2": {
                    n = 4;
                    break Label_0263;
                }
                case "vnd.android.cursor.item/postal-address_v2": {
                    n = 3;
                    break Label_0263;
                }
                case "vnd.android.cursor.item/name": {
                    n = 2;
                    break Label_0263;
                }
                case "vnd.android.cursor.item/contact_event": {
                    n = 1;
                    break Label_0263;
                }
                case "vnd.android.cursor.item/email_v2": {
                    n = 0;
                    break Label_0263;
                }
                default:
                    break;
            }
            n = -1;
        }
        switch (n) {
            default: {
                return null;
            }
            case 7: {
                DatabaseUtils.cursorStringToContentValuesIfPresent(cursor, contentValues, "data1");
                DatabaseUtils.cursorStringToContentValuesIfPresent(cursor, contentValues, "data3");
                break;
            }
            case 6: {
                DatabaseUtils.cursorStringToContentValuesIfPresent(cursor, contentValues, "data1");
                DatabaseUtils.cursorIntToContentValuesIfPresent(cursor, contentValues, "data2");
                DatabaseUtils.cursorStringToContentValuesIfPresent(cursor, contentValues, "data3");
                break;
            }
            case 5: {
                DatabaseUtils.cursorStringToContentValuesIfPresent(cursor, contentValues, "data14");
                break;
            }
            case 4: {
                DatabaseUtils.cursorIntToContentValuesIfPresent(cursor, contentValues, "data2");
                DatabaseUtils.cursorStringToContentValuesIfPresent(cursor, contentValues, "data3");
                DatabaseUtils.cursorIntToContentValuesIfPresent(cursor, contentValues, "is_primary");
                if (!cursor.isNull(n2)) {
                    contentValues.put("data1", cursor.getString(n2));
                    break;
                }
                DatabaseUtils.cursorStringToContentValuesIfPresent(cursor, contentValues, "data1");
                break;
            }
            case 3: {
                DatabaseUtils.cursorStringToContentValuesIfPresent(cursor, contentValues, "data1");
                DatabaseUtils.cursorIntToContentValuesIfPresent(cursor, contentValues, "data2");
                DatabaseUtils.cursorStringToContentValuesIfPresent(cursor, contentValues, "data3");
                break;
            }
            case 2: {
                DatabaseUtils.cursorStringToContentValuesIfPresent(cursor, contentValues, "data1");
                DatabaseUtils.cursorStringToContentValuesIfPresent(cursor, contentValues, "data2");
                DatabaseUtils.cursorStringToContentValuesIfPresent(cursor, contentValues, "data3");
                break;
            }
            case 1: {
                DatabaseUtils.cursorIntToContentValuesIfPresent(cursor, contentValues, "data2");
                DatabaseUtils.cursorStringToContentValuesIfPresent(cursor, contentValues, "data1");
                break;
            }
            case 0: {
                DatabaseUtils.cursorStringToContentValuesIfPresent(cursor, contentValues, "data1");
                DatabaseUtils.cursorIntToContentValuesIfPresent(cursor, contentValues, "data2");
                DatabaseUtils.cursorStringToContentValuesIfPresent(cursor, contentValues, "data3");
                DatabaseUtils.cursorIntToContentValuesIfPresent(cursor, contentValues, "is_primary");
                break;
            }
        }
        return contentValues;
    }
    
    public final Map<String, ByteBuffer> b(Cursor cursor, final ContactsQueryStats contactsQueryStats) {
        final int columnIndex = cursor.getColumnIndex("lookup");
        final String s = "mimetype";
        final int columnIndex2 = cursor.getColumnIndex("mimetype");
        final String s2 = "data4";
        final int columnIndex3 = cursor.getColumnIndex("data4");
        final int columnIndex4 = cursor.getColumnIndex("starred");
        final int columnIndex5 = cursor.getColumnIndex("pinned");
        final int columnIndex6 = cursor.getColumnIndex("custom_ringtone");
        final int columnIndex7 = cursor.getColumnIndex("send_to_voicemail");
        final HashSet set = new HashSet();
        final HashSet set2 = new HashSet();
        final HashSet set3 = new HashSet();
        final HashSet set4 = new HashSet();
        final HashMap hashMap = new HashMap();
        try {
            do {
                final ContentValues a = this.a(cursor, columnIndex2, columnIndex3);
                if (a != null) {
                    ++contactsQueryStats.a;
                    final String string = cursor.getString(columnIndex);
                    if (cursor.getInt(columnIndex4) > 0) {
                        set.add(string);
                    }
                    if (cursor.getInt(columnIndex5) > 0) {
                        set2.add(string);
                    }
                    if (!tdy.b0((CharSequence)cursor.getString(columnIndex6))) {
                        set3.add(string);
                    }
                    if (cursor.getInt(columnIndex7) > 0) {
                        set4.add(string);
                    }
                    final List list = hashMap.get(string);
                    final List a2 = rth.a(0);
                    List list2;
                    if ((list2 = list) == null) {
                        list2 = a2;
                    }
                    list2.add(a);
                    hashMap.put(string, list2);
                }
            } while (cursor.moveToNext());
        }
        catch (final IllegalStateException ex) {
            e9a.d((Throwable)ex);
        }
        contactsQueryStats.c = set.size();
        contactsQueryStats.d = set2.size();
        contactsQueryStats.e = set3.size();
        contactsQueryStats.f = set4.size();
        final Iterator iterator = hashMap.values().iterator();
        String s3;
        while (true) {
            final boolean hasNext = iterator.hasNext();
            s3 = "vnd.android.cursor.item/email_v2";
            cursor = (Cursor)"vnd.android.cursor.item/phone_v2";
            if (!hasNext) {
                break;
            }
            final List list3 = (List)iterator.next();
            final HashSet<String> set5 = new HashSet<String>();
            final Iterator iterator2 = list3.iterator();
            while (iterator2.hasNext()) {
                set5.add(((ContentValues)iterator2.next()).getAsString(s));
            }
            for (final String s4 : set5) {
                Objects.requireNonNull(s4);
                s4.hashCode();
                int n = -1;
                switch (s4) {
                    case "vnd.android.cursor.item/nickname": {
                        n = 6;
                        break;
                    }
                    case "vnd.android.cursor.item/relation": {
                        n = 5;
                        break;
                    }
                    case "vnd.android.cursor.item/photo": {
                        n = 4;
                        break;
                    }
                    case "vnd.android.cursor.item/phone_v2": {
                        n = 3;
                        break;
                    }
                    case "vnd.android.cursor.item/postal-address_v2": {
                        n = 2;
                        break;
                    }
                    case "vnd.android.cursor.item/contact_event": {
                        n = 1;
                        break;
                    }
                    case "vnd.android.cursor.item/email_v2": {
                        n = 0;
                        break;
                    }
                    default:
                        break;
                }
                switch (n) {
                    default: {
                        continue;
                    }
                    case 6: {
                        ++contactsQueryStats.i;
                        continue;
                    }
                    case 5: {
                        ++contactsQueryStats.k;
                        continue;
                    }
                    case 4: {
                        ++contactsQueryStats.j;
                        continue;
                    }
                    case 3: {
                        ++contactsQueryStats.g;
                        continue;
                    }
                    case 2: {
                        ++contactsQueryStats.l;
                        continue;
                    }
                    case 1: {
                        ++contactsQueryStats.m;
                        continue;
                    }
                    case 0: {
                        ++contactsQueryStats.h;
                        continue;
                    }
                }
            }
            ++contactsQueryStats.b;
        }
        final sjg t = sjg.t();
        final Iterator iterator4 = hashMap.values().iterator();
        String s5 = s2;
        final String s6 = s;
        while (iterator4.hasNext()) {
            final List list4 = (List)iterator4.next();
            final HashMap<String, List> hashMap2 = new HashMap<String, List>();
            final smw smw = new smw();
            final Iterator iterator5 = list4.iterator();
            boolean b = false;
            while (iterator5.hasNext()) {
                final ContentValues contentValues = (ContentValues)iterator5.next();
                final String asString = contentValues.getAsString(s6);
                if (asString.equals(cursor) || asString.equals(s3)) {
                    b = true;
                }
                final List list5 = hashMap2.get(asString);
                final List a3 = rth.a(0);
                List list6;
                if ((list6 = list5) == null) {
                    list6 = a3;
                }
                list6.add(contentValues);
                hashMap2.put(asString, list6);
            }
            if (!b) {
                continue;
            }
            final List list7 = hashMap2.get("vnd.android.cursor.item/name");
            String s7 = null;
            HashMap<String, List> hashMap3 = null;
            String s9 = null;
            String s10 = null;
            Label_2877: {
                Label_2780: {
                    if (tmw.b(-1073741823)) {
                        if (smw.c || smw.h) {
                            Log.w("vCard", "Invalid flag is used in vCard 4.0 construction. Ignored.");
                        }
                        Label_1713: {
                            if (list7 != null && !list7.isEmpty()) {
                                final ContentValues l = smw.l((List)list7);
                                String asString2 = l.getAsString("data3");
                                final String asString3 = l.getAsString("data5");
                                final String asString4 = l.getAsString("data2");
                                final String asString5 = l.getAsString(s5);
                                final String asString6 = l.getAsString("data6");
                                final String asString7 = l.getAsString("data1");
                                if (TextUtils.isEmpty((CharSequence)asString2) && TextUtils.isEmpty((CharSequence)asString4) && TextUtils.isEmpty((CharSequence)asString3) && TextUtils.isEmpty((CharSequence)asString5) && TextUtils.isEmpty((CharSequence)asString6)) {
                                    if (TextUtils.isEmpty((CharSequence)asString7)) {
                                        smw.b("FN", "");
                                        break Label_1713;
                                    }
                                    asString2 = asString7;
                                }
                                final String asString8 = l.getAsString("data9");
                                final String asString9 = l.getAsString("data8");
                                final String asString10 = l.getAsString("data7");
                                final String k = smw.k(asString2);
                                final String i = smw.k(asString4);
                                final String j = smw.k(asString3);
                                final String m = smw.k(asString5);
                                final String k2 = smw.k(asString6);
                                smw.l.append("N");
                                if (!TextUtils.isEmpty((CharSequence)asString8) || !TextUtils.isEmpty((CharSequence)asString9) || !TextUtils.isEmpty((CharSequence)asString10)) {
                                    smw.l.append(";");
                                    final StringBuilder sb = new StringBuilder();
                                    sb.append(smw.k(asString8));
                                    sb.append(';');
                                    sb.append(smw.k(asString10));
                                    sb.append(';');
                                    sb.append(smw.k(asString9));
                                    final String string2 = sb.toString();
                                    final StringBuilder l2 = smw.l;
                                    l2.append("SORT-AS=");
                                    l2.append(umw.g(string2, umw.h));
                                }
                                smw.l.append(":");
                                smw.l.append(k);
                                smw.l.append(";");
                                smw.l.append(i);
                                smw.l.append(";");
                                smw.l.append(j);
                                smw.l.append(";");
                                smw.l.append(m);
                                smw.l.append(";");
                                smw.l.append(k2);
                                smw.l.append("\r\n");
                                if (TextUtils.isEmpty((CharSequence)asString7)) {
                                    Log.w("vCard", "DISPLAY_NAME is empty.");
                                    final HashMap a4 = tmw.a;
                                    smw.b("FN", smw.k(umw.a(0, asString2, asString3, asString4, asString5, asString6)));
                                }
                                else {
                                    final String k3 = smw.k(asString7);
                                    smw.l.append("FN");
                                    smw.l.append(":");
                                    smw.l.append(k3);
                                    smw.l.append("\r\n");
                                }
                                smw.d(l);
                                break Label_2780;
                            }
                            smw.b("FN", "");
                        }
                        s7 = "";
                        final String s8 = "data2";
                        hashMap3 = hashMap2;
                        s9 = s5;
                        s10 = s8;
                        break Label_2877;
                    }
                    final String s11 = "data1";
                    if (list7 == null || list7.isEmpty()) {
                        final String s12 = "data2";
                        final String s13 = s5;
                        if (tmw.a(-1073741823)) {
                            final String s14 = "";
                            smw.b("N", s14);
                            smw.b("FN", s14);
                        }
                        else if (smw.c) {
                            smw.b("N", "");
                        }
                        s7 = "";
                        hashMap3 = hashMap2;
                        s10 = s12;
                        s9 = s13;
                        break Label_2877;
                    }
                    final ContentValues l3 = smw.l((List)list7);
                    final String asString11 = l3.getAsString("data3");
                    final String asString12 = l3.getAsString("data5");
                    final String asString13 = l3.getAsString("data2");
                    final String asString14 = l3.getAsString(s5);
                    final String asString15 = l3.getAsString("data6");
                    String s15 = l3.getAsString(s11);
                    if (TextUtils.isEmpty((CharSequence)asString11) && TextUtils.isEmpty((CharSequence)asString13)) {
                        if (!TextUtils.isEmpty((CharSequence)s15)) {
                            smw.h("N", s15);
                            smw.l.append(";");
                            smw.l.append(";");
                            smw.l.append(";");
                            smw.l.append(";");
                            smw.l.append("\r\n");
                            smw.h("FN", s15);
                            smw.l.append("\r\n");
                        }
                        else if (tmw.a(-1073741823)) {
                            smw.b("N", "");
                            smw.b("FN", "");
                        }
                        else if (smw.c) {
                            smw.b("N", "");
                        }
                    }
                    else {
                        final boolean m2 = smw.m(new String[] { asString11, asString13, asString12, asString14, asString15 });
                        final boolean b2 = !smw.g && (!umw.c(new String[] { asString11 }) || !umw.c(new String[] { asString13 }) || !umw.c(new String[] { asString12 }) || !umw.c(new String[] { asString14 }) || !umw.c(new String[] { asString15 }));
                        if (TextUtils.isEmpty((CharSequence)s15)) {
                            s15 = umw.a(0, asString11, asString12, asString13, asString14, asString15);
                        }
                        final boolean m3 = smw.m(new String[] { s15 });
                        final boolean b3 = !smw.g && !umw.c(new String[] { s15 });
                        String s16;
                        String s17;
                        String s18;
                        String s19;
                        String s20;
                        if (b2) {
                            s16 = smw.j(asString11);
                            s17 = smw.j(asString13);
                            s18 = smw.j(asString12);
                            s19 = smw.j(asString14);
                            s20 = smw.j(asString15);
                        }
                        else {
                            s16 = smw.k(asString11);
                            s17 = smw.k(asString13);
                            s18 = smw.k(asString12);
                            s19 = smw.k(asString14);
                            s20 = smw.k(asString15);
                        }
                        String s21;
                        if (b3) {
                            s21 = smw.j(s15);
                        }
                        else {
                            s21 = smw.k(s15);
                        }
                        smw.l.append("N");
                        if (smw.c) {
                            if (m2) {
                                smw.l.append(";");
                                smw.l.append(smw.k);
                            }
                            if (b2) {
                                smw.l.append(";");
                                smw.l.append("ENCODING=QUOTED-PRINTABLE");
                            }
                            smw.l.append(":");
                            smw.l.append(s15);
                            smw.l.append(";");
                            smw.l.append(";");
                            smw.l.append(";");
                            smw.l.append(";");
                        }
                        else {
                            if (m2) {
                                smw.l.append(";");
                                smw.l.append(smw.k);
                            }
                            if (b2) {
                                smw.l.append(";");
                                smw.l.append("ENCODING=QUOTED-PRINTABLE");
                            }
                            smw.l.append(":");
                            smw.l.append(s16);
                            smw.l.append(";");
                            smw.l.append(s17);
                            smw.l.append(";");
                            smw.l.append(s18);
                            smw.l.append(";");
                            smw.l.append(s19);
                            smw.l.append(";");
                            smw.l.append(s20);
                        }
                        smw.l.append("\r\n");
                        smw.l.append("FN");
                        if (m3) {
                            smw.l.append(";");
                            smw.l.append(smw.k);
                        }
                        if (b3) {
                            smw.l.append(";");
                            smw.l.append("ENCODING=QUOTED-PRINTABLE");
                        }
                        smw.l.append(":");
                        smw.l.append(s21);
                        smw.l.append("\r\n");
                    }
                    smw.d(l3);
                }
                final String s22 = "data2";
                s7 = "";
                hashMap3 = hashMap2;
                s9 = s5;
                s10 = s22;
            }
            final String s23 = "data1";
            final String s24 = "data3";
            final List list8 = hashMap3.get(cursor);
            boolean b4;
            String s28;
            String s29;
            String s30;
            if (list8 != null) {
                final HashSet set6 = new HashSet();
                final Iterator iterator6 = list8.iterator();
                b4 = false;
                while (iterator6.hasNext()) {
                    final ContentValues contentValues2 = (ContentValues)iterator6.next();
                    final Integer asInteger = contentValues2.getAsInteger(s10);
                    final String asString16 = contentValues2.getAsString(s24);
                    final Integer asInteger2 = contentValues2.getAsInteger("is_primary");
                    final boolean b5 = asInteger2 != null && asInteger2 > 0;
                    final String asString17 = contentValues2.getAsString(s23);
                    String trim;
                    if ((trim = asString17) != null) {
                        trim = asString17.trim();
                    }
                    if (TextUtils.isEmpty((CharSequence)trim)) {
                        continue;
                    }
                    int intValue;
                    if (asInteger != null) {
                        intValue = asInteger;
                    }
                    else {
                        intValue = 1;
                    }
                    if (intValue != 6) {
                        final HashMap a5 = tmw.a;
                        final ArrayList<String> list9 = new ArrayList<String>();
                        StringBuilder sb2 = new StringBuilder();
                        for (int length = trim.length(), n2 = 0; n2 < length; ++n2) {
                            final char char1 = trim.charAt(n2);
                            if (char1 == '\n' && sb2.length() > 0) {
                                list9.add(sb2.toString());
                                sb2 = new StringBuilder();
                            }
                            else {
                                sb2.append(char1);
                            }
                        }
                        if (sb2.length() > 0) {
                            list9.add(sb2.toString());
                        }
                        if (list9.isEmpty()) {
                            continue;
                        }
                        for (final String s25 : list9) {
                            if (!set6.contains(s25)) {
                                String s26 = s25.replace(',', 'p').replace(';', 'w');
                                if (TextUtils.equals((CharSequence)s26, (CharSequence)s25)) {
                                    final StringBuilder sb3 = new StringBuilder();
                                    for (int length2 = s25.length(), n3 = 0; n3 < length2; ++n3) {
                                        final char char2 = s25.charAt(n3);
                                        if (Character.isDigit(char2) || char2 == '+') {
                                            sb3.append(char2);
                                        }
                                    }
                                    final HashMap a6 = umw.a;
                                    int n4;
                                    if (tmw.b.contains(-1073741823)) {
                                        n4 = 2;
                                    }
                                    else {
                                        n4 = 1;
                                    }
                                    final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)sb3.toString());
                                    PhoneNumberUtils.formatNumber((Editable)spannableStringBuilder, n4);
                                    s26 = spannableStringBuilder.toString();
                                }
                                String c = s26;
                                if (tmw.b(-1073741823)) {
                                    c = s26;
                                    if (!TextUtils.isEmpty((CharSequence)s26)) {
                                        c = s26;
                                        if (!s26.startsWith("tel:")) {
                                            c = l7k.c("tel:", s26);
                                        }
                                    }
                                }
                                set6.add(s25);
                                smw.e(Integer.valueOf(intValue), asString16, c, b5);
                            }
                        }
                    }
                    else if (!set6.contains(trim)) {
                        set6.add(trim);
                        smw.e(Integer.valueOf(intValue), asString16, trim, b5);
                    }
                    b4 = true;
                }
                final String s27 = s24;
                s28 = s10;
                s29 = s23;
                s30 = s27;
            }
            else {
                s30 = "data3";
                s28 = s10;
                s29 = "data1";
                b4 = false;
            }
            if (!b4 && smw.c) {
                smw.e(Integer.valueOf(1), s7, s7, false);
            }
            final List list10 = hashMap3.get(s3);
            int n6;
            if (list10 != null) {
                final HashSet set7 = new HashSet();
                final Iterator iterator8 = list10.iterator();
                int n5 = 0;
                while (true) {
                    n6 = n5;
                    if (!iterator8.hasNext()) {
                        break;
                    }
                    final ContentValues contentValues3 = (ContentValues)iterator8.next();
                    final String asString18 = contentValues3.getAsString(s29);
                    String trim2;
                    if ((trim2 = asString18) != null) {
                        trim2 = asString18.trim();
                    }
                    if (TextUtils.isEmpty((CharSequence)trim2)) {
                        continue;
                    }
                    final Integer asInteger3 = contentValues3.getAsInteger(s28);
                    int intValue2;
                    if (asInteger3 != null) {
                        intValue2 = asInteger3;
                    }
                    else {
                        intValue2 = 3;
                    }
                    final String asString19 = contentValues3.getAsString(s30);
                    final Integer asInteger4 = contentValues3.getAsInteger("is_primary");
                    final boolean b6 = asInteger4 != null && asInteger4 > 0;
                    if (!set7.contains(trim2)) {
                        set7.add(trim2);
                        smw.a(intValue2, asString19, trim2, b6);
                    }
                    n5 = 1;
                }
            }
            else {
                n6 = 0;
            }
            if (n6 == 0 && smw.c) {
                smw.a(1, s7, s7, false);
            }
            final String string3 = smw.toString();
            byte[] array;
            try {
                final MessageDigest instance = MessageDigest.getInstance("SHA-256");
                instance.reset();
                array = instance.digest(string3.getBytes());
            }
            catch (final NoSuchAlgorithmException ex2) {
                array = string3.getBytes();
            }
            t.w((Object)string3, (Object)ByteBuffer.wrap(array));
            s5 = s9;
        }
        return (Map)((h4j)t).e();
    }
    
    public final void c(final ContactsQueryStats contactsQueryStats) {
        if ((contactsQueryStats.a != 0L || contactsQueryStats.b != 0L || contactsQueryStats.c != 0L || contactsQueryStats.d != 0L || contactsQueryStats.e != 0L || contactsQueryStats.f != 0L || contactsQueryStats.g != 0L || contactsQueryStats.h != 0L || contactsQueryStats.i != 0L || contactsQueryStats.j != 0L || contactsQueryStats.k != 0L || contactsQueryStats.l != 0L || contactsQueryStats.m != 0L) && dta.b().b("onboarding_address_book_report_stats", false)) {
            try {
                final String a = mih.a((Object)contactsQueryStats);
                final zf4 zf4 = new zf4(nca.g("onboarding", "import_addressbook", "", "stats", "read"));
                zf4.F0 = a;
                saw.b((okm)zf4);
            }
            catch (final IOException ex) {
                e9a.d((Throwable)ex);
            }
        }
    }
}
