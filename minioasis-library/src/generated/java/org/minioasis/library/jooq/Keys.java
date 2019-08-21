/*
 * This file is generated by jOOQ.
*/
package org.minioasis.library.jooq;


import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;
import org.minioasis.library.jooq.tables.Account;
import org.minioasis.library.jooq.tables.Attachment;
import org.minioasis.library.jooq.tables.AttachmentCheckout;
import org.minioasis.library.jooq.tables.Biblio;
import org.minioasis.library.jooq.tables.BiblioTag;
import org.minioasis.library.jooq.tables.Checkout;
import org.minioasis.library.jooq.tables.FormData;
import org.minioasis.library.jooq.tables.Groups;
import org.minioasis.library.jooq.tables.Holiday;
import org.minioasis.library.jooq.tables.Item;
import org.minioasis.library.jooq.tables.ItemStatus;
import org.minioasis.library.jooq.tables.JournalEntry;
import org.minioasis.library.jooq.tables.JournalEntryLine;
import org.minioasis.library.jooq.tables.Location;
import org.minioasis.library.jooq.tables.Patron;
import org.minioasis.library.jooq.tables.PatronType;
import org.minioasis.library.jooq.tables.Publisher;
import org.minioasis.library.jooq.tables.Reservation;
import org.minioasis.library.jooq.tables.Role;
import org.minioasis.library.jooq.tables.Series;
import org.minioasis.library.jooq.tables.Tag;
import org.minioasis.library.jooq.tables.TelegramUser;
import org.minioasis.library.jooq.tables.User;
import org.minioasis.library.jooq.tables.UserRole;
import org.minioasis.library.jooq.tables.records.AccountRecord;
import org.minioasis.library.jooq.tables.records.AttachmentCheckoutRecord;
import org.minioasis.library.jooq.tables.records.AttachmentRecord;
import org.minioasis.library.jooq.tables.records.BiblioRecord;
import org.minioasis.library.jooq.tables.records.BiblioTagRecord;
import org.minioasis.library.jooq.tables.records.CheckoutRecord;
import org.minioasis.library.jooq.tables.records.FormDataRecord;
import org.minioasis.library.jooq.tables.records.GroupsRecord;
import org.minioasis.library.jooq.tables.records.HolidayRecord;
import org.minioasis.library.jooq.tables.records.ItemRecord;
import org.minioasis.library.jooq.tables.records.ItemStatusRecord;
import org.minioasis.library.jooq.tables.records.JournalEntryLineRecord;
import org.minioasis.library.jooq.tables.records.JournalEntryRecord;
import org.minioasis.library.jooq.tables.records.LocationRecord;
import org.minioasis.library.jooq.tables.records.PatronRecord;
import org.minioasis.library.jooq.tables.records.PatronTypeRecord;
import org.minioasis.library.jooq.tables.records.PublisherRecord;
import org.minioasis.library.jooq.tables.records.ReservationRecord;
import org.minioasis.library.jooq.tables.records.RoleRecord;
import org.minioasis.library.jooq.tables.records.SeriesRecord;
import org.minioasis.library.jooq.tables.records.TagRecord;
import org.minioasis.library.jooq.tables.records.TelegramUserRecord;
import org.minioasis.library.jooq.tables.records.UserRecord;
import org.minioasis.library.jooq.tables.records.UserRoleRecord;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>PUBLIC</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<AccountRecord, Long> IDENTITY_ACCOUNT = Identities0.IDENTITY_ACCOUNT;
    public static final Identity<AttachmentRecord, Long> IDENTITY_ATTACHMENT = Identities0.IDENTITY_ATTACHMENT;
    public static final Identity<AttachmentCheckoutRecord, Long> IDENTITY_ATTACHMENT_CHECKOUT = Identities0.IDENTITY_ATTACHMENT_CHECKOUT;
    public static final Identity<BiblioRecord, Long> IDENTITY_BIBLIO = Identities0.IDENTITY_BIBLIO;
    public static final Identity<CheckoutRecord, Long> IDENTITY_CHECKOUT = Identities0.IDENTITY_CHECKOUT;
    public static final Identity<FormDataRecord, Long> IDENTITY_FORM_DATA = Identities0.IDENTITY_FORM_DATA;
    public static final Identity<GroupsRecord, Long> IDENTITY_GROUPS = Identities0.IDENTITY_GROUPS;
    public static final Identity<HolidayRecord, Long> IDENTITY_HOLIDAY = Identities0.IDENTITY_HOLIDAY;
    public static final Identity<ItemRecord, Long> IDENTITY_ITEM = Identities0.IDENTITY_ITEM;
    public static final Identity<JournalEntryRecord, Long> IDENTITY_JOURNAL_ENTRY = Identities0.IDENTITY_JOURNAL_ENTRY;
    public static final Identity<JournalEntryLineRecord, Long> IDENTITY_JOURNAL_ENTRY_LINE = Identities0.IDENTITY_JOURNAL_ENTRY_LINE;
    public static final Identity<LocationRecord, Long> IDENTITY_LOCATION = Identities0.IDENTITY_LOCATION;
    public static final Identity<PatronRecord, Long> IDENTITY_PATRON = Identities0.IDENTITY_PATRON;
    public static final Identity<PatronTypeRecord, Long> IDENTITY_PATRON_TYPE = Identities0.IDENTITY_PATRON_TYPE;
    public static final Identity<PublisherRecord, Long> IDENTITY_PUBLISHER = Identities0.IDENTITY_PUBLISHER;
    public static final Identity<ReservationRecord, Long> IDENTITY_RESERVATION = Identities0.IDENTITY_RESERVATION;
    public static final Identity<SeriesRecord, Long> IDENTITY_SERIES = Identities0.IDENTITY_SERIES;
    public static final Identity<TagRecord, Long> IDENTITY_TAG = Identities0.IDENTITY_TAG;
    public static final Identity<TelegramUserRecord, Long> IDENTITY_TELEGRAM_USER = Identities0.IDENTITY_TELEGRAM_USER;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AccountRecord> CONSTRAINT_E = UniqueKeys0.CONSTRAINT_E;
    public static final UniqueKey<AccountRecord> UK_K9QLQIJT38KMRYAFDHHQ04LON = UniqueKeys0.UK_K9QLQIJT38KMRYAFDHHQ04LON;
    public static final UniqueKey<AttachmentRecord> CONSTRAINT_A = UniqueKeys0.CONSTRAINT_A;
    public static final UniqueKey<AttachmentRecord> UK_ODYTD07MTGMJLAEF9T1WGKVPC = UniqueKeys0.UK_ODYTD07MTGMJLAEF9T1WGKVPC;
    public static final UniqueKey<AttachmentCheckoutRecord> CONSTRAINT_6 = UniqueKeys0.CONSTRAINT_6;
    public static final UniqueKey<BiblioRecord> CONSTRAINT_7 = UniqueKeys0.CONSTRAINT_7;
    public static final UniqueKey<BiblioTagRecord> CONSTRAINT_3 = UniqueKeys0.CONSTRAINT_3;
    public static final UniqueKey<CheckoutRecord> CONSTRAINT_8 = UniqueKeys0.CONSTRAINT_8;
    public static final UniqueKey<FormDataRecord> CONSTRAINT_1 = UniqueKeys0.CONSTRAINT_1;
    public static final UniqueKey<GroupsRecord> CONSTRAINT_7D = UniqueKeys0.CONSTRAINT_7D;
    public static final UniqueKey<GroupsRecord> UK_16FAME6JE5OYJNCQMBL1N5177 = UniqueKeys0.UK_16FAME6JE5OYJNCQMBL1N5177;
    public static final UniqueKey<HolidayRecord> CONSTRAINT_6B = UniqueKeys0.CONSTRAINT_6B;
    public static final UniqueKey<HolidayRecord> UK_3JJDI9M362Y965LR542FPEJT = UniqueKeys0.UK_3JJDI9M362Y965LR542FPEJT;
    public static final UniqueKey<ItemRecord> CONSTRAINT_2 = UniqueKeys0.CONSTRAINT_2;
    public static final UniqueKey<ItemRecord> UK_BFO0NHIH8F3JL9M9UBLNXR4UY = UniqueKeys0.UK_BFO0NHIH8F3JL9M9UBLNXR4UY;
    public static final UniqueKey<ItemStatusRecord> CONSTRAINT_64 = UniqueKeys0.CONSTRAINT_64;
    public static final UniqueKey<ItemStatusRecord> UK_GW69EG5BWDJ2BC6GJ8GYXT9AD = UniqueKeys0.UK_GW69EG5BWDJ2BC6GJ8GYXT9AD;
    public static final UniqueKey<JournalEntryRecord> CONSTRAINT_E8 = UniqueKeys0.CONSTRAINT_E8;
    public static final UniqueKey<JournalEntryLineRecord> CONSTRAINT_F = UniqueKeys0.CONSTRAINT_F;
    public static final UniqueKey<LocationRecord> CONSTRAINT_9 = UniqueKeys0.CONSTRAINT_9;
    public static final UniqueKey<LocationRecord> UK_SAHIXF1V7F7XNS19CBG12D946 = UniqueKeys0.UK_SAHIXF1V7F7XNS19CBG12D946;
    public static final UniqueKey<PatronRecord> CONSTRAINT_8C = UniqueKeys0.CONSTRAINT_8C;
    public static final UniqueKey<PatronRecord> UK_3CND47DLNMG4XI9OQ6JNI97X3 = UniqueKeys0.UK_3CND47DLNMG4XI9OQ6JNI97X3;
    public static final UniqueKey<PatronRecord> UK_E9FRUVR3H2998KELNJ73YM6CY = UniqueKeys0.UK_E9FRUVR3H2998KELNJ73YM6CY;
    public static final UniqueKey<PatronTypeRecord> CONSTRAINT_5 = UniqueKeys0.CONSTRAINT_5;
    public static final UniqueKey<PatronTypeRecord> UK_T54V4235XB53JP0OYG9QXYBBM = UniqueKeys0.UK_T54V4235XB53JP0OYG9QXYBBM;
    public static final UniqueKey<PublisherRecord> CONSTRAINT_FC = UniqueKeys0.CONSTRAINT_FC;
    public static final UniqueKey<PublisherRecord> UK_H9TRV4XHMH6S68VBW9BA6TO70 = UniqueKeys0.UK_H9TRV4XHMH6S68VBW9BA6TO70;
    public static final UniqueKey<ReservationRecord> CONSTRAINT_23 = UniqueKeys0.CONSTRAINT_23;
    public static final UniqueKey<RoleRecord> CONSTRAINT_26 = UniqueKeys0.CONSTRAINT_26;
    public static final UniqueKey<RoleRecord> UK8SEWWNPAMNGI6B1DWAA88ASKK = UniqueKeys0.UK8SEWWNPAMNGI6B1DWAA88ASKK;
    public static final UniqueKey<SeriesRecord> CONSTRAINT_91 = UniqueKeys0.CONSTRAINT_91;
    public static final UniqueKey<SeriesRecord> UK_S4JD0PRFGED1PUCSTGAOH8QJ4 = UniqueKeys0.UK_S4JD0PRFGED1PUCSTGAOH8QJ4;
    public static final UniqueKey<TagRecord> CONSTRAINT_14 = UniqueKeys0.CONSTRAINT_14;
    public static final UniqueKey<TagRecord> UK_1WDPSED5KNA2Y38HNBGRNHI5B = UniqueKeys0.UK_1WDPSED5KNA2Y38HNBGRNHI5B;
    public static final UniqueKey<TelegramUserRecord> CONSTRAINT_B = UniqueKeys0.CONSTRAINT_B;
    public static final UniqueKey<TelegramUserRecord> UK_ABIUVF67GFNDN35NGQDPKQ7DY = UniqueKeys0.UK_ABIUVF67GFNDN35NGQDPKQ7DY;
    public static final UniqueKey<TelegramUserRecord> UK_8FJRX8Y7KIFVM13XIF72SY5BF = UniqueKeys0.UK_8FJRX8Y7KIFVM13XIF72SY5BF;
    public static final UniqueKey<UserRecord> CONSTRAINT_27 = UniqueKeys0.CONSTRAINT_27;
    public static final UniqueKey<UserRecord> UK_SB8BBOUER5WAK8VYIIY4PF2BX = UniqueKeys0.UK_SB8BBOUER5WAK8VYIIY4PF2BX;
    public static final UniqueKey<UserRoleRecord> CONSTRAINT_BC = UniqueKeys0.CONSTRAINT_BC;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<AttachmentRecord, ItemRecord> FK_ATTACHMENT_ITEM = ForeignKeys0.FK_ATTACHMENT_ITEM;
    public static final ForeignKey<AttachmentCheckoutRecord, AttachmentRecord> FK_ATTACHMENTCHECKOUT_ATTACHMENT = ForeignKeys0.FK_ATTACHMENTCHECKOUT_ATTACHMENT;
    public static final ForeignKey<AttachmentCheckoutRecord, CheckoutRecord> FK_ATTACHMENTCHECKOUT_CHECKOUT = ForeignKeys0.FK_ATTACHMENTCHECKOUT_CHECKOUT;
    public static final ForeignKey<AttachmentCheckoutRecord, PatronRecord> FK_ATTACHMENTCHECKOUT_PATRON = ForeignKeys0.FK_ATTACHMENTCHECKOUT_PATRON;
    public static final ForeignKey<BiblioRecord, PublisherRecord> FK_BIBLIO_PUBLISHER = ForeignKeys0.FK_BIBLIO_PUBLISHER;
    public static final ForeignKey<BiblioRecord, SeriesRecord> FK_BIBLIO_SERIES = ForeignKeys0.FK_BIBLIO_SERIES;
    public static final ForeignKey<BiblioTagRecord, BiblioRecord> FK2Y040I75GSYULS6MEGB8PEOLK = ForeignKeys0.FK2Y040I75GSYULS6MEGB8PEOLK;
    public static final ForeignKey<BiblioTagRecord, TagRecord> FK6WR2OUSD2B6D5E9EDOYA9C7OI = ForeignKeys0.FK6WR2OUSD2B6D5E9EDOYA9C7OI;
    public static final ForeignKey<CheckoutRecord, ItemRecord> FK_CHECKOUT_ITEM = ForeignKeys0.FK_CHECKOUT_ITEM;
    public static final ForeignKey<CheckoutRecord, PatronRecord> FK_CHECKOUT_PATRON = ForeignKeys0.FK_CHECKOUT_PATRON;
    public static final ForeignKey<ItemRecord, BiblioRecord> FK_ITEM_BIBLIO = ForeignKeys0.FK_ITEM_BIBLIO;
    public static final ForeignKey<ItemRecord, ItemStatusRecord> FK_ITEM_ITEMSTATUS = ForeignKeys0.FK_ITEM_ITEMSTATUS;
    public static final ForeignKey<ItemRecord, LocationRecord> FK_ITEM_LOCATION = ForeignKeys0.FK_ITEM_LOCATION;
    public static final ForeignKey<JournalEntryLineRecord, AccountRecord> FK_JOURNALENTRYLINE_ACCOUNT = ForeignKeys0.FK_JOURNALENTRYLINE_ACCOUNT;
    public static final ForeignKey<JournalEntryLineRecord, JournalEntryRecord> FK_JOURNALENTRYLINE_JOURNALENTRY = ForeignKeys0.FK_JOURNALENTRYLINE_JOURNALENTRY;
    public static final ForeignKey<PatronRecord, GroupsRecord> FK_PATRON_GROUP = ForeignKeys0.FK_PATRON_GROUP;
    public static final ForeignKey<PatronRecord, PatronTypeRecord> FK_PATRON_PATRONTYPE = ForeignKeys0.FK_PATRON_PATRONTYPE;
    public static final ForeignKey<ReservationRecord, BiblioRecord> FK_RESERVATION_BIBLIO = ForeignKeys0.FK_RESERVATION_BIBLIO;
    public static final ForeignKey<ReservationRecord, PatronRecord> FK_RESERVATION_PATRON = ForeignKeys0.FK_RESERVATION_PATRON;
    public static final ForeignKey<UserRoleRecord, UserRecord> FK859N2JVI8IVHUI0RL0ESWS6O = ForeignKeys0.FK859N2JVI8IVHUI0RL0ESWS6O;
    public static final ForeignKey<UserRoleRecord, RoleRecord> FKA68196081FVOVJHKEK5M97N3Y = ForeignKeys0.FKA68196081FVOVJHKEK5M97N3Y;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<AccountRecord, Long> IDENTITY_ACCOUNT = Internal.createIdentity(Account.ACCOUNT, Account.ACCOUNT.ID);
        public static Identity<AttachmentRecord, Long> IDENTITY_ATTACHMENT = Internal.createIdentity(Attachment.ATTACHMENT, Attachment.ATTACHMENT.ID);
        public static Identity<AttachmentCheckoutRecord, Long> IDENTITY_ATTACHMENT_CHECKOUT = Internal.createIdentity(AttachmentCheckout.ATTACHMENT_CHECKOUT, AttachmentCheckout.ATTACHMENT_CHECKOUT.ID);
        public static Identity<BiblioRecord, Long> IDENTITY_BIBLIO = Internal.createIdentity(Biblio.BIBLIO, Biblio.BIBLIO.ID);
        public static Identity<CheckoutRecord, Long> IDENTITY_CHECKOUT = Internal.createIdentity(Checkout.CHECKOUT, Checkout.CHECKOUT.ID);
        public static Identity<FormDataRecord, Long> IDENTITY_FORM_DATA = Internal.createIdentity(FormData.FORM_DATA, FormData.FORM_DATA.ID);
        public static Identity<GroupsRecord, Long> IDENTITY_GROUPS = Internal.createIdentity(Groups.GROUPS, Groups.GROUPS.ID);
        public static Identity<HolidayRecord, Long> IDENTITY_HOLIDAY = Internal.createIdentity(Holiday.HOLIDAY, Holiday.HOLIDAY.ID);
        public static Identity<ItemRecord, Long> IDENTITY_ITEM = Internal.createIdentity(Item.ITEM, Item.ITEM.ID);
        public static Identity<JournalEntryRecord, Long> IDENTITY_JOURNAL_ENTRY = Internal.createIdentity(JournalEntry.JOURNAL_ENTRY, JournalEntry.JOURNAL_ENTRY.ID);
        public static Identity<JournalEntryLineRecord, Long> IDENTITY_JOURNAL_ENTRY_LINE = Internal.createIdentity(JournalEntryLine.JOURNAL_ENTRY_LINE, JournalEntryLine.JOURNAL_ENTRY_LINE.ID);
        public static Identity<LocationRecord, Long> IDENTITY_LOCATION = Internal.createIdentity(Location.LOCATION, Location.LOCATION.ID);
        public static Identity<PatronRecord, Long> IDENTITY_PATRON = Internal.createIdentity(Patron.PATRON, Patron.PATRON.ID);
        public static Identity<PatronTypeRecord, Long> IDENTITY_PATRON_TYPE = Internal.createIdentity(PatronType.PATRON_TYPE, PatronType.PATRON_TYPE.ID);
        public static Identity<PublisherRecord, Long> IDENTITY_PUBLISHER = Internal.createIdentity(Publisher.PUBLISHER, Publisher.PUBLISHER.ID);
        public static Identity<ReservationRecord, Long> IDENTITY_RESERVATION = Internal.createIdentity(Reservation.RESERVATION, Reservation.RESERVATION.ID);
        public static Identity<SeriesRecord, Long> IDENTITY_SERIES = Internal.createIdentity(Series.SERIES, Series.SERIES.ID);
        public static Identity<TagRecord, Long> IDENTITY_TAG = Internal.createIdentity(Tag.TAG, Tag.TAG.ID);
        public static Identity<TelegramUserRecord, Long> IDENTITY_TELEGRAM_USER = Internal.createIdentity(TelegramUser.TELEGRAM_USER, TelegramUser.TELEGRAM_USER.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<AccountRecord> CONSTRAINT_E = Internal.createUniqueKey(Account.ACCOUNT, "CONSTRAINT_E", Account.ACCOUNT.ID);
        public static final UniqueKey<AccountRecord> UK_K9QLQIJT38KMRYAFDHHQ04LON = Internal.createUniqueKey(Account.ACCOUNT, "UK_K9QLQIJT38KMRYAFDHHQ04LON", Account.ACCOUNT.CODE);
        public static final UniqueKey<AttachmentRecord> CONSTRAINT_A = Internal.createUniqueKey(Attachment.ATTACHMENT, "CONSTRAINT_A", Attachment.ATTACHMENT.ID);
        public static final UniqueKey<AttachmentRecord> UK_ODYTD07MTGMJLAEF9T1WGKVPC = Internal.createUniqueKey(Attachment.ATTACHMENT, "UK_ODYTD07MTGMJLAEF9T1WGKVPC", Attachment.ATTACHMENT.BARCODE);
        public static final UniqueKey<AttachmentCheckoutRecord> CONSTRAINT_6 = Internal.createUniqueKey(AttachmentCheckout.ATTACHMENT_CHECKOUT, "CONSTRAINT_6", AttachmentCheckout.ATTACHMENT_CHECKOUT.ID);
        public static final UniqueKey<BiblioRecord> CONSTRAINT_7 = Internal.createUniqueKey(Biblio.BIBLIO, "CONSTRAINT_7", Biblio.BIBLIO.ID);
        public static final UniqueKey<BiblioTagRecord> CONSTRAINT_3 = Internal.createUniqueKey(BiblioTag.BIBLIO_TAG, "CONSTRAINT_3", BiblioTag.BIBLIO_TAG.BIBLIO_ID, BiblioTag.BIBLIO_TAG.TAG_ID);
        public static final UniqueKey<CheckoutRecord> CONSTRAINT_8 = Internal.createUniqueKey(Checkout.CHECKOUT, "CONSTRAINT_8", Checkout.CHECKOUT.ID);
        public static final UniqueKey<FormDataRecord> CONSTRAINT_1 = Internal.createUniqueKey(FormData.FORM_DATA, "CONSTRAINT_1", FormData.FORM_DATA.ID);
        public static final UniqueKey<GroupsRecord> CONSTRAINT_7D = Internal.createUniqueKey(Groups.GROUPS, "CONSTRAINT_7D", Groups.GROUPS.ID);
        public static final UniqueKey<GroupsRecord> UK_16FAME6JE5OYJNCQMBL1N5177 = Internal.createUniqueKey(Groups.GROUPS, "UK_16FAME6JE5OYJNCQMBL1N5177", Groups.GROUPS.CODE);
        public static final UniqueKey<HolidayRecord> CONSTRAINT_6B = Internal.createUniqueKey(Holiday.HOLIDAY, "CONSTRAINT_6B", Holiday.HOLIDAY.ID);
        public static final UniqueKey<HolidayRecord> UK_3JJDI9M362Y965LR542FPEJT = Internal.createUniqueKey(Holiday.HOLIDAY, "UK_3JJDI9M362Y965LR542FPEJT", Holiday.HOLIDAY.NAME);
        public static final UniqueKey<ItemRecord> CONSTRAINT_2 = Internal.createUniqueKey(Item.ITEM, "CONSTRAINT_2", Item.ITEM.ID);
        public static final UniqueKey<ItemRecord> UK_BFO0NHIH8F3JL9M9UBLNXR4UY = Internal.createUniqueKey(Item.ITEM, "UK_BFO0NHIH8F3JL9M9UBLNXR4UY", Item.ITEM.BARCODE);
        public static final UniqueKey<ItemStatusRecord> CONSTRAINT_64 = Internal.createUniqueKey(ItemStatus.ITEM_STATUS, "CONSTRAINT_64", ItemStatus.ITEM_STATUS.ID);
        public static final UniqueKey<ItemStatusRecord> UK_GW69EG5BWDJ2BC6GJ8GYXT9AD = Internal.createUniqueKey(ItemStatus.ITEM_STATUS, "UK_GW69EG5BWDJ2BC6GJ8GYXT9AD", ItemStatus.ITEM_STATUS.NAME);
        public static final UniqueKey<JournalEntryRecord> CONSTRAINT_E8 = Internal.createUniqueKey(JournalEntry.JOURNAL_ENTRY, "CONSTRAINT_E8", JournalEntry.JOURNAL_ENTRY.ID);
        public static final UniqueKey<JournalEntryLineRecord> CONSTRAINT_F = Internal.createUniqueKey(JournalEntryLine.JOURNAL_ENTRY_LINE, "CONSTRAINT_F", JournalEntryLine.JOURNAL_ENTRY_LINE.ID);
        public static final UniqueKey<LocationRecord> CONSTRAINT_9 = Internal.createUniqueKey(Location.LOCATION, "CONSTRAINT_9", Location.LOCATION.ID);
        public static final UniqueKey<LocationRecord> UK_SAHIXF1V7F7XNS19CBG12D946 = Internal.createUniqueKey(Location.LOCATION, "UK_SAHIXF1V7F7XNS19CBG12D946", Location.LOCATION.NAME);
        public static final UniqueKey<PatronRecord> CONSTRAINT_8C = Internal.createUniqueKey(Patron.PATRON, "CONSTRAINT_8C", Patron.PATRON.ID);
        public static final UniqueKey<PatronRecord> UK_3CND47DLNMG4XI9OQ6JNI97X3 = Internal.createUniqueKey(Patron.PATRON, "UK_3CND47DLNMG4XI9OQ6JNI97X3", Patron.PATRON.CARD_KEY);
        public static final UniqueKey<PatronRecord> UK_E9FRUVR3H2998KELNJ73YM6CY = Internal.createUniqueKey(Patron.PATRON, "UK_E9FRUVR3H2998KELNJ73YM6CY", Patron.PATRON.ENTANGLED);
        public static final UniqueKey<PatronTypeRecord> CONSTRAINT_5 = Internal.createUniqueKey(PatronType.PATRON_TYPE, "CONSTRAINT_5", PatronType.PATRON_TYPE.ID);
        public static final UniqueKey<PatronTypeRecord> UK_T54V4235XB53JP0OYG9QXYBBM = Internal.createUniqueKey(PatronType.PATRON_TYPE, "UK_T54V4235XB53JP0OYG9QXYBBM", PatronType.PATRON_TYPE.CODE);
        public static final UniqueKey<PublisherRecord> CONSTRAINT_FC = Internal.createUniqueKey(Publisher.PUBLISHER, "CONSTRAINT_FC", Publisher.PUBLISHER.ID);
        public static final UniqueKey<PublisherRecord> UK_H9TRV4XHMH6S68VBW9BA6TO70 = Internal.createUniqueKey(Publisher.PUBLISHER, "UK_H9TRV4XHMH6S68VBW9BA6TO70", Publisher.PUBLISHER.NAME);
        public static final UniqueKey<ReservationRecord> CONSTRAINT_23 = Internal.createUniqueKey(Reservation.RESERVATION, "CONSTRAINT_23", Reservation.RESERVATION.ID);
        public static final UniqueKey<RoleRecord> CONSTRAINT_26 = Internal.createUniqueKey(Role.ROLE, "CONSTRAINT_26", Role.ROLE.ROLE_ID);
        public static final UniqueKey<RoleRecord> UK8SEWWNPAMNGI6B1DWAA88ASKK = Internal.createUniqueKey(Role.ROLE, "UK8SEWWNPAMNGI6B1DWAA88ASKK", Role.ROLE.NAME);
        public static final UniqueKey<SeriesRecord> CONSTRAINT_91 = Internal.createUniqueKey(Series.SERIES, "CONSTRAINT_91", Series.SERIES.ID);
        public static final UniqueKey<SeriesRecord> UK_S4JD0PRFGED1PUCSTGAOH8QJ4 = Internal.createUniqueKey(Series.SERIES, "UK_S4JD0PRFGED1PUCSTGAOH8QJ4", Series.SERIES.NAME);
        public static final UniqueKey<TagRecord> CONSTRAINT_14 = Internal.createUniqueKey(Tag.TAG, "CONSTRAINT_14", Tag.TAG.ID);
        public static final UniqueKey<TagRecord> UK_1WDPSED5KNA2Y38HNBGRNHI5B = Internal.createUniqueKey(Tag.TAG, "UK_1WDPSED5KNA2Y38HNBGRNHI5B", Tag.TAG.NAME);
        public static final UniqueKey<TelegramUserRecord> CONSTRAINT_B = Internal.createUniqueKey(TelegramUser.TELEGRAM_USER, "CONSTRAINT_B", TelegramUser.TELEGRAM_USER.ID);
        public static final UniqueKey<TelegramUserRecord> UK_ABIUVF67GFNDN35NGQDPKQ7DY = Internal.createUniqueKey(TelegramUser.TELEGRAM_USER, "UK_ABIUVF67GFNDN35NGQDPKQ7DY", TelegramUser.TELEGRAM_USER.CARD_KEY);
        public static final UniqueKey<TelegramUserRecord> UK_8FJRX8Y7KIFVM13XIF72SY5BF = Internal.createUniqueKey(TelegramUser.TELEGRAM_USER, "UK_8FJRX8Y7KIFVM13XIF72SY5BF", TelegramUser.TELEGRAM_USER.CHAT_ID);
        public static final UniqueKey<UserRecord> CONSTRAINT_27 = Internal.createUniqueKey(User.USER, "CONSTRAINT_27", User.USER.USER_ID);
        public static final UniqueKey<UserRecord> UK_SB8BBOUER5WAK8VYIIY4PF2BX = Internal.createUniqueKey(User.USER, "UK_SB8BBOUER5WAK8VYIIY4PF2BX", User.USER.USERNAME);
        public static final UniqueKey<UserRoleRecord> CONSTRAINT_BC = Internal.createUniqueKey(UserRole.USER_ROLE, "CONSTRAINT_BC", UserRole.USER_ROLE.USER_ID, UserRole.USER_ROLE.ROLE_ID);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<AttachmentRecord, ItemRecord> FK_ATTACHMENT_ITEM = Internal.createForeignKey(org.minioasis.library.jooq.Keys.CONSTRAINT_2, Attachment.ATTACHMENT, "FK_ATTACHMENT_ITEM", Attachment.ATTACHMENT.ITEM_ID);
        public static final ForeignKey<AttachmentCheckoutRecord, AttachmentRecord> FK_ATTACHMENTCHECKOUT_ATTACHMENT = Internal.createForeignKey(org.minioasis.library.jooq.Keys.CONSTRAINT_A, AttachmentCheckout.ATTACHMENT_CHECKOUT, "FK_ATTACHMENTCHECKOUT_ATTACHMENT", AttachmentCheckout.ATTACHMENT_CHECKOUT.ATTACHMENT_ID);
        public static final ForeignKey<AttachmentCheckoutRecord, CheckoutRecord> FK_ATTACHMENTCHECKOUT_CHECKOUT = Internal.createForeignKey(org.minioasis.library.jooq.Keys.CONSTRAINT_8, AttachmentCheckout.ATTACHMENT_CHECKOUT, "FK_ATTACHMENTCHECKOUT_CHECKOUT", AttachmentCheckout.ATTACHMENT_CHECKOUT.CHECKOUT_ID);
        public static final ForeignKey<AttachmentCheckoutRecord, PatronRecord> FK_ATTACHMENTCHECKOUT_PATRON = Internal.createForeignKey(org.minioasis.library.jooq.Keys.CONSTRAINT_8C, AttachmentCheckout.ATTACHMENT_CHECKOUT, "FK_ATTACHMENTCHECKOUT_PATRON", AttachmentCheckout.ATTACHMENT_CHECKOUT.PATRON_ID);
        public static final ForeignKey<BiblioRecord, PublisherRecord> FK_BIBLIO_PUBLISHER = Internal.createForeignKey(org.minioasis.library.jooq.Keys.CONSTRAINT_FC, Biblio.BIBLIO, "FK_BIBLIO_PUBLISHER", Biblio.BIBLIO.PUBLISHER_ID);
        public static final ForeignKey<BiblioRecord, SeriesRecord> FK_BIBLIO_SERIES = Internal.createForeignKey(org.minioasis.library.jooq.Keys.CONSTRAINT_91, Biblio.BIBLIO, "FK_BIBLIO_SERIES", Biblio.BIBLIO.SERIES_ID);
        public static final ForeignKey<BiblioTagRecord, BiblioRecord> FK2Y040I75GSYULS6MEGB8PEOLK = Internal.createForeignKey(org.minioasis.library.jooq.Keys.CONSTRAINT_7, BiblioTag.BIBLIO_TAG, "FK2Y040I75GSYULS6MEGB8PEOLK", BiblioTag.BIBLIO_TAG.BIBLIO_ID);
        public static final ForeignKey<BiblioTagRecord, TagRecord> FK6WR2OUSD2B6D5E9EDOYA9C7OI = Internal.createForeignKey(org.minioasis.library.jooq.Keys.CONSTRAINT_14, BiblioTag.BIBLIO_TAG, "FK6WR2OUSD2B6D5E9EDOYA9C7OI", BiblioTag.BIBLIO_TAG.TAG_ID);
        public static final ForeignKey<CheckoutRecord, ItemRecord> FK_CHECKOUT_ITEM = Internal.createForeignKey(org.minioasis.library.jooq.Keys.CONSTRAINT_2, Checkout.CHECKOUT, "FK_CHECKOUT_ITEM", Checkout.CHECKOUT.ITEM_ID);
        public static final ForeignKey<CheckoutRecord, PatronRecord> FK_CHECKOUT_PATRON = Internal.createForeignKey(org.minioasis.library.jooq.Keys.CONSTRAINT_8C, Checkout.CHECKOUT, "FK_CHECKOUT_PATRON", Checkout.CHECKOUT.PATRON_ID);
        public static final ForeignKey<ItemRecord, BiblioRecord> FK_ITEM_BIBLIO = Internal.createForeignKey(org.minioasis.library.jooq.Keys.CONSTRAINT_7, Item.ITEM, "FK_ITEM_BIBLIO", Item.ITEM.BIBLIO_ID);
        public static final ForeignKey<ItemRecord, ItemStatusRecord> FK_ITEM_ITEMSTATUS = Internal.createForeignKey(org.minioasis.library.jooq.Keys.CONSTRAINT_64, Item.ITEM, "FK_ITEM_ITEMSTATUS", Item.ITEM.ITEM_STATUS_ID);
        public static final ForeignKey<ItemRecord, LocationRecord> FK_ITEM_LOCATION = Internal.createForeignKey(org.minioasis.library.jooq.Keys.CONSTRAINT_9, Item.ITEM, "FK_ITEM_LOCATION", Item.ITEM.LOCATION_ID);
        public static final ForeignKey<JournalEntryLineRecord, AccountRecord> FK_JOURNALENTRYLINE_ACCOUNT = Internal.createForeignKey(org.minioasis.library.jooq.Keys.CONSTRAINT_E, JournalEntryLine.JOURNAL_ENTRY_LINE, "FK_JOURNALENTRYLINE_ACCOUNT", JournalEntryLine.JOURNAL_ENTRY_LINE.ACCOUNT_ID);
        public static final ForeignKey<JournalEntryLineRecord, JournalEntryRecord> FK_JOURNALENTRYLINE_JOURNALENTRY = Internal.createForeignKey(org.minioasis.library.jooq.Keys.CONSTRAINT_E8, JournalEntryLine.JOURNAL_ENTRY_LINE, "FK_JOURNALENTRYLINE_JOURNALENTRY", JournalEntryLine.JOURNAL_ENTRY_LINE.JOURNALENTRY_ID);
        public static final ForeignKey<PatronRecord, GroupsRecord> FK_PATRON_GROUP = Internal.createForeignKey(org.minioasis.library.jooq.Keys.CONSTRAINT_7D, Patron.PATRON, "FK_PATRON_GROUP", Patron.PATRON.GROUP_ID);
        public static final ForeignKey<PatronRecord, PatronTypeRecord> FK_PATRON_PATRONTYPE = Internal.createForeignKey(org.minioasis.library.jooq.Keys.CONSTRAINT_5, Patron.PATRON, "FK_PATRON_PATRONTYPE", Patron.PATRON.PATRONTYPE_ID);
        public static final ForeignKey<ReservationRecord, BiblioRecord> FK_RESERVATION_BIBLIO = Internal.createForeignKey(org.minioasis.library.jooq.Keys.CONSTRAINT_7, Reservation.RESERVATION, "FK_RESERVATION_BIBLIO", Reservation.RESERVATION.BIBLIO_ID);
        public static final ForeignKey<ReservationRecord, PatronRecord> FK_RESERVATION_PATRON = Internal.createForeignKey(org.minioasis.library.jooq.Keys.CONSTRAINT_8C, Reservation.RESERVATION, "FK_RESERVATION_PATRON", Reservation.RESERVATION.PATRON_ID);
        public static final ForeignKey<UserRoleRecord, UserRecord> FK859N2JVI8IVHUI0RL0ESWS6O = Internal.createForeignKey(org.minioasis.library.jooq.Keys.CONSTRAINT_27, UserRole.USER_ROLE, "FK859N2JVI8IVHUI0RL0ESWS6O", UserRole.USER_ROLE.USER_ID);
        public static final ForeignKey<UserRoleRecord, RoleRecord> FKA68196081FVOVJHKEK5M97N3Y = Internal.createForeignKey(org.minioasis.library.jooq.Keys.CONSTRAINT_26, UserRole.USER_ROLE, "FKA68196081FVOVJHKEK5M97N3Y", UserRole.USER_ROLE.ROLE_ID);
    }
}
