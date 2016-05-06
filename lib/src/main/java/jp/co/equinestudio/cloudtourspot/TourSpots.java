package jp.co.equinestudio.cloudtourspot;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * 公共クラウドシステムからのAPIレスポンスクラス
 */
@Accessors(prefix = "m") @Getter @Setter
public class TourSpots {

    /** レスポンス内容 */
    @SerializedName("tourspots")
    private List<TourSpot> mTourSpots;

    @Accessors(prefix = "m") @Getter @Setter
    public class TourSpot  {

        @SerializedName("name") // 名称
        private Name mName;

        @Accessors(prefix = "m") @Getter @Setter
        public class Name {
            @SerializedName("name1") // 名称１
            private Property mName1;
            @SerializedName("name2") // 名称２
            private Property mName2;
        }

        @SerializedName("genres") // 分類（ジャンル情報）
        private List<Genre> mGenres;
        @Accessors(prefix = "m") @Getter @Setter
        public class Genre {
            @SerializedName("L") // 大ジャンル
            private String mLarge;
            @SerializedName("M") // 中ジャンル
            private String mMedium;
            @SerializedName("S") // 小ジャンル
            private String mSmall;
        }

        @SerializedName("views") // 画像情報
        private List<View> mViews;
        @Accessors(prefix = "m") @Getter @Setter
        public class View {
            @SerializedName("name") // 写真の名前
            private Property mName;
            @SerializedName("when") // 撮影年月日
            private String mWhen;
            @SerializedName("where") // 撮影場所
            private String mWhere;
            @SerializedName("copyright") // 著作権の有無
            private String mCopyright;
            @SerializedName("fid") // 写真ファイル名
            private String mFId;
        }

        @SerializedName("descs") // 説明情報
        private List<Description> mDescriptions;
        @Accessors(prefix = "m") @Getter @Setter
        public class Description {
            @SerializedName("body") // 説明文
            private String mBody;
        }

        @SerializedName("place") // 場所情報
        private Place mPlace;
        @Accessors(prefix = "m") @Getter @Setter
        public class Place {
            @SerializedName("coordinates") // 座標
            private Coordinate mCoordinate;
            @SerializedName("postal_code") // 郵便番号
            private String mPostalCode;
            @SerializedName("pref")
            private Property mPref;
            @SerializedName("city")
            private Property mCity;
            @SerializedName("street")
            private Property mStreet;
            @SerializedName("building")
            private Property mBuilding;
            @SerializedName("phone")
            private String mPhone;
            @SerializedName("fax")
            private String mFax;
            @SerializedName("email")
            private String mEmail;
            @SerializedName("url")
            private String mUrl;
        }

        @SerializedName("parkings") // 駐車場情報
        private List<Parking> mParkings;
        @Accessors(prefix = "m") @Getter @Setter
        public class Parking {
            @SerializedName("desc") // 見出し・区分
            private String mDescription;
            @SerializedName("name") // 名称
            private String mName;
            @SerializedName("company") // 会社名
            private String mCompany;
            @SerializedName("minutes_to_walk") // 所要時間
            private int mMinuteToWalk;
            @SerializedName("free_or_pay") // 料金有無
            private String mFreeOrPay;
            @SerializedName("capacity") // 駐車可能台数
            private Capacity mCapacity;
            @SerializedName("postal_code")
            private String mPostalCode;
            @SerializedName("pref")
            private String mPref;
            @SerializedName("city")
            private String mCity;
            @SerializedName("street")
            private String mStreet;
            @SerializedName("building")
            private String mBuilding;
            @SerializedName("phone")
            private String mPhone;
            @SerializedName("fax")
            private String mFax;
            @SerializedName("email")
            private String mEmail;
            @SerializedName("url")
            private String mUrl;
            @SerializedName("info")
            private String mInfo;

            @Accessors(prefix = "m") @Getter @Setter
            public class Capacity {
                @SerializedName("normal_size") // 普通車
                private int mNormalSize;
                @SerializedName("large_size") // 大型車
                private int mLargeSize;
                @SerializedName("specialized") // 特殊車
                private int mSpecialized;

            }
        }

        @SerializedName("facilities") // 付帯設備情報
        private List<Facility> mFacilities;
        @Accessors(prefix = "m") @Getter @Setter
        public class Facility {
            @SerializedName("name") // 名称
            private String mName;
            @SerializedName("quantity") // 数量
            private String mQuantity;
            @SerializedName("note") // 備考
            private String mNote;
        }

        @SerializedName("toilets") // トイレ情報
        private List<Toilet> mToilets;
        @Accessors(prefix = "m") @Getter @Setter
        public class Toilet {
            @SerializedName("quantity") // 数量
            private int mQuantity;
            @SerializedName("quantity_handicapped") // 身体障害者トイレ数
            private int mQuantityHandicapped;
            @SerializedName("quantity_withbaby") // 乳幼児同伴トイレ数
            private int mQuantityWithBaby;
        }

        @SerializedName("visit") // 入場情報
        private Visit mVisit;
        @Accessors(prefix = "m") @Getter @Setter
        public class Visit {

            @SerializedName("features") // 特徴
            private List<Feature> mFeatures;

            @Accessors(prefix = "m") @Getter @Setter
            public class Feature {
                @SerializedName("group") // 区分
                private String mGroup;
                @SerializedName("content") // 区分内容
                private String mContent;
                @SerializedName("made_period") // 作成年代
                private String mMadePeriod;
                @SerializedName("registered") // 指定年
                private String mRegistered;
                @SerializedName("start_month") // 開始月
                private String mStartMonth;
                @SerializedName("end_month") // 終了月
                private String mEndMonth;
                @SerializedName("infant_charge") // 幼児料金
                private int mInfantCharge;
                @SerializedName("schoolchildren_charge") // 小学生料金
                private int mSchoolChildrenCharge;
                @SerializedName("junior_charge") // 中学生料金
                private int mJuniorCharge;
                @SerializedName("high_charge") // 高校生料金
                private int mHighCharge;
                @SerializedName("university_charge") // 大学生料金
                private int mUniversityCharge;
                @SerializedName("adult_charge") // 大人料金
                private int mAdultCharge;
                @SerializedName("senior_charge") // 65歳以上料金
                private int mSeniorCharge;
                @SerializedName("group_charge") // 団体料金
                private int mGroupCharge;
                @SerializedName("note") // 備考
                private String mNote;

            }

            @SerializedName("service") // 利用情報
            private Service mService;
            @Accessors(prefix = "m") @Getter @Setter
            public class Service {
                @SerializedName("open") // 期間情報
                private String mOpen;

                @SerializedName("periods") // 期間の並び
                private List<Period> mPeriodList;
                @Accessors(prefix = "m") @Getter @Setter
                public class Period {
                    @SerializedName("type") // 種別
                    private String mType;
                    @SerializedName("season") // 季節
                    private String mSeason;
                    @SerializedName("st_date") // 開始日
                    private String mStartDate;
                    @SerializedName("en_date") // 終了日
                    private String mEndDate;
                    @SerializedName("day_of_week") // 曜日
                    private String mDayOfWeek;
                    @SerializedName("hours") // 時間帯
                    private String mHours;
                    @SerializedName("note") // 備考
                    private String mNote;
                }
            }

            @SerializedName("guide") // ガイド情報
            private Guide mGuide;
            @Accessors(prefix = "m") @Getter @Setter
            public class Guide {
                @SerializedName("reservation") // 予約
                private String mReservation;
                @SerializedName("charge") // 料金
                private String mCharge;
                @SerializedName("phone")
                private String mPhone;
                @SerializedName("fax")
                private String mFax;
                @SerializedName("email")
                private String mEmail;
                @SerializedName("url")
                private String mUrl;
                @SerializedName("note")
                private String mNote;

            }

            @SerializedName("reserve") // 予約情報
            private Reserve mReserve;
            @Accessors(prefix = "m") @Getter @Setter
            public class Reserve {
                @SerializedName("how") // 予約方法
                private String mHow;
                @SerializedName("who") // 予約先名称
                private String mWho;
                @SerializedName("postal_code")
                private String mPostalCode;
                @SerializedName("pref")
                private String mPref;
                @SerializedName("city")
                private String mCity;
                @SerializedName("street")
                private String mStreet;
                @SerializedName("building")
                private String mBuilding;
                @SerializedName("phone")
                private String mPhone;
                @SerializedName("fax")
                private String mFax;
                @SerializedName("email")
                private String mEmail;
                @SerializedName("url")
                private String mUrl;
            }

            @SerializedName("bus") // 送迎バス
            private Bus mBus;
            @Accessors(prefix = "m") @Getter @Setter
            public class Bus {
                @SerializedName("pickup_place") // 乗車場所
                private String mPickupPlace;
                @SerializedName("operation") // 運行状況
                private Operation mOperation;

                @Accessors(prefix = "m") @Getter @Setter
                public class Operation {
                    @SerializedName("frequency") // サービス頻度
                    private String mFrequency;
                    @SerializedName("hours") // 時間帯
                    private String mHours;
                }

                @SerializedName("advanced") // 事前
                private Advanced mAdvanced;

                @Accessors(prefix = "m") @Getter @Setter
                public class Advanced {
                    @SerializedName("notice") // 事前連絡
                    private String mNotice;
                    @SerializedName("reserve") // 事前予約
                    private String mReserve;
                }

            }

            @SerializedName("accesses") // アクセス情報
            private List<Access> mAccesses;
            @Accessors(prefix = "m") @Getter @Setter
            public class Access {

                @SerializedName("from") // 起点
                private From mFrom;
                @Accessors(prefix = "m") @Getter @Setter
                public class From {
                    @SerializedName("name") // 名称
                    private String mName;
                    @SerializedName("type") // 種類
                    private String mType;
                }

                @SerializedName("start") // 出発時刻
                private String mStart;
                @SerializedName("arrive") // 到着時刻
                private String mArrive;
                @SerializedName("total_time") // 時間
                private int mTotalTime;
                @SerializedName("total_charge") // 金額
                private int mTotalCharge;

                @SerializedName("paths") // 経路詳細
                private List<Path> mPaths;
                @Accessors(prefix = "m") @Getter @Setter
                public class Path {
                    @SerializedName("type") // 区間の種類
                    private String mType;

                    @SerializedName("to") // 区間終点
                    private To mTo;
                    @Accessors(prefix = "m") @Getter @Setter
                    public class To {
                        @SerializedName("name") // 名称
                        private String mName;
                        @SerializedName("type") // 種類
                        private String mType;
                        @SerializedName("wait") // 待ち時間
                        private String mWait;
                    }
                    @SerializedName("start") // 出発時刻
                    private String mStart;
                    @SerializedName("arrive") // 到着時刻
                    private String mArrive;
                    @SerializedName("time") // 区間時間
                    private int mTime;
                    @SerializedName("km") // 区間距離
                    private float mKm;
                    @SerializedName("charge") // 区間料金
                    private int mCharge;

                    @SerializedName("line") // 路線
                    private Line mLine;
                    @Accessors(prefix = "m") @Getter @Setter
                    public class Line {
                        @SerializedName("name") // 路線名
                        private String mName;
                        @SerializedName("operator") // 路線運営
                        private String mOperator;
                        @SerializedName("dest") // 行き先
                        private String mDestiny;
                    }

                    @SerializedName("stop") // 乗り場
                    private String mStop;
                    @SerializedName("traffic") // 交通手段
                    private String mTraffic;
                    @SerializedName("seat_time") // 乗車時間
                    private int mSeatTime;
                    @SerializedName("nearest_stop") // 最寄り駅・バス停留所・船着場・インターチェンジ
                    private String mNearestStop;
                    @SerializedName("nearest_minutes_to_walk") // 最寄り地点からの徒歩時間
                    private int mNearestMinutesToWalk;
                    @SerializedName("note")
                    private String mNote;

                }

            }
            @SerializedName("notes")
            private List<String> mNotes;

        }

        @SerializedName("stay") // 宿泊情報
        private Stay mStay;
        @Accessors(prefix = "m") @Getter @Setter
        public class Stay {
            @SerializedName("type") // 宿泊種別
            private String mType;

            @SerializedName("rooms") // 部屋情報
            private List<Room> mRooms;
            @Accessors(prefix = "m") @Getter @Setter
            public class Room {
                @SerializedName("type") // 部屋のタイプ
                private String mType;
                @SerializedName("quantity") // 数
                private int mQuantity;
                @SerializedName("child_charge_min_1night1meal") // 一泊一食最低小人料金
                private int mChildChargeMin1Night1Meal;
                @SerializedName("adult_charge_min_1night1meal") // 一泊一食最低大人料金
                private int mAdultChargeMin1Night1Meal;
                @SerializedName("child_charge_min_1night2meals") // 一泊二食最低小人料金
                private int mChildChargeMin1Night2Meals;
                @SerializedName("adult_charge_min_1night2meals") // 一泊二食最低大人料金
                private int mAdultChargeMin1Night2Meals;
                @SerializedName("charge_min_1night") // 素泊まり最低料金
                private int mChargeMin1Night;
                @SerializedName("charge_breakfast") // 朝食料金
                private int mChargeBreakfast;
                @SerializedName("charge_dinner") // 夕食料金
                private int mChargeDinner;
                @SerializedName("charge_min") // 最低料金
                private int mChargeMin;
                @SerializedName("charge_max") // 最高料金
                private int mChargeMax;
                @SerializedName("cond_persons") // 掲示料金の条件（X名1室の場合の1名料金）
                private String mCondPersons;
                @SerializedName("cond_point_of_time") // 掲示料金の時点（何時時点の料金か）
                private String mCondPointOfTime;
                @SerializedName("checkin") // チェックイン時刻
                private String mCheckin;
                @SerializedName("checkout") // チェックアウト時刻
                private String mCheckout;
                @SerializedName("phone")
                private String mPhone;
                @SerializedName("fax")
                private String mFax;
                @SerializedName("email")
                private String mEmail;
                @SerializedName("url")
                private String mUrl;
                @SerializedName("info") // その他
                private String mInfo;
                @SerializedName("note")
                private String mNote;
            }
        }

        @SerializedName("disaster") // 防災情報
        private Disaster mDisaster;
        @Accessors(prefix = "m") @Getter @Setter
        public class Disaster {
            @SerializedName("aed") // AED設置
            private Aed mAed;
            @Accessors(prefix = "m") @Getter @Setter
            public class Aed {
                @SerializedName("name") // AED設置施設名
                private String mName;
                @SerializedName("place") // AED設置場所
                private String mPlace;
            }
            @SerializedName("criticism_place") // 避難場所
            private String mCriticismPlace;
            @SerializedName("well") // 非常用井戸
            private String mWell;
        }

        @SerializedName("barrier_free") // バリアフリー情報
        private BarrierFree mBarrierFree;
        @Accessors(prefix = "m") @Getter @Setter
        public class BarrierFree {
            @SerializedName("parking") // 優先駐車場
            private int mParking;
            @SerializedName("toilet") // 多目的トイレ
            private Toilet mToilet;
            @Accessors(prefix = "m") @Getter @Setter
            public class Toilet {
                @SerializedName("quantity_before") // バリアフリー新法施行前トイレ数
                private int mQuantityBefore;
                @SerializedName("quantity_after") // バリアフリー新法施行後トイレ数（オストメイト対応）
                private int mQuantityAfter;
            }
            @SerializedName("wheelchair") // 車椅子貸出
            private String mWheelchair;
            @SerializedName("wheelchair_phone") // 車椅子対応公衆電話
            private String mWheelchairPhone;
            @SerializedName("dog") // 盲導犬、介助犬、聴導犬同伴
            private String mDog;
            @SerializedName("slope") // スロープ
            private String mSlope;
            @SerializedName("bump") // 段差
            private String mBump;
            @SerializedName("elevator") // エレベーター
            private String mElevator;
            @SerializedName("escalator") // エスカレーター
            private String mEscalator;
            @SerializedName("stair") // 階段
            private String mStair;
            @SerializedName("handrail") // 手すり
            private String mHandrail;
            @SerializedName("braill_block") // 点字ブロック
            private String mBraillBlock;
            @SerializedName("note")
            private String mNote;
            @SerializedName("infos")
            private List<String> mInfos;
        }

        @SerializedName("foreign") // 外国語情報
        private Foreign mForeign;
        @Accessors(prefix = "m") @Getter @Setter
        public class Foreign {
            @SerializedName("written") // 表記
            private Language mWritten;
            @SerializedName("speak") // 会話
            private Language mSpeak;
            @Accessors(prefix = "m") @Getter @Setter
            public class Language {
                @SerializedName("lang1") // 英語
                private String mLang1;
                @SerializedName("lang2") // 中国語（繁体字）
                private String mLang2;
                @SerializedName("lang3") // 中国語（簡体字）
                private String mLang3;
                @SerializedName("lang4") // 韓国語
                private String mLang4;
                @SerializedName("lang5") // タイ語
                private String mLang5;
                @SerializedName("lang6") // フランス語
                private String mLang6;
                @SerializedName("lang7") // ドイツ語
                private String mLang7;
                @SerializedName("lang8") // イタリア語
                private String mLang8;
                @SerializedName("lang9") // ロシア語
                private String mLang9;
                @SerializedName("lang10") // スペイン語
                private String mLang10;
                @SerializedName("info") // 上記項目に該当しない情報
                private String mInfo;
            }
        }

        @SerializedName("wifi") // Free Wi-Fi情報
        private Wifi mWifi;
        @Accessors(prefix = "m") @Getter @Setter
        public class Wifi {
            @SerializedName("established") // 有無
            private String mEstablished;
            @SerializedName("url")
            private String mUrl;
            @SerializedName("info")
            private String mInfo;
        }

        @SerializedName("mng") // 管理情報
        private Manage mManage;
        @Accessors(prefix = "m") @Getter @Setter
        public class Manage {
            @SerializedName("lgcode") // 市区町村コード
            private String mLgCode;
            @SerializedName("data_source") // 情報提供元
            private String mDataSource;
            @SerializedName("refbase") // 参照番号
            private String mRefBase;
            @SerializedName("refsub") // 参照枝番
            private int mRefSub;
            @SerializedName("status") //状態
            private Status mStatus;
        }

        @Accessors(prefix = "m") @Getter @Setter
        public class Property {
            @SerializedName("written") // 表記
            private String mWritten;
            @SerializedName("spoken") // よみ
            private String mSpoken;
        }

        @Accessors(prefix = "m") @Getter @Setter
        public class Coordinate {
            @SerializedName("longitude") // 経度
            private double mLongitude;
            @SerializedName("latitude") // 緯度
            private double mLatitude;
        }

        @Accessors(prefix = "m") @Getter @Setter
        public class Status {
            @SerializedName("update") // 最終修正日時
            private String mUpdate;
        }

    }

}
