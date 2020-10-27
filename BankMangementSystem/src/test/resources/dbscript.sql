DROP DATABASE IF EXISTS IBSBANK;

CREATE DATABASE IBSBANK;
USE IBSBANK;

CREATE TABLE ROLE
(
ROLE_ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT = 100,
ROLE_NAME VARCHAR(30),
ROLE_PRIV VARCHAR(20),
BRNCH_ID INT,
ACTIVE_STATUS VARCHAR(20),
CRET_DT DATE
);

CREATE TABLE BRANCH_DTL(
BRANCH_ID INT PRIMARY KEY,
BRANCH_NM VARCHAR(300),
IFSC VARCHAR(30)
);


CREATE TABLE KYC_DTL(
REG_ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT = 100,
FULL_NM VARCHAR(200),
GENDER VARCHAR(1),
DOB DATE,
CRET_DT DATE,
MDFYD_DT DATE,
ROLE_ID INT,
CUST_ACCT_TYP VARCHAR(30),
KYC_PROOF_TYP VARCHAR(50),
KYC_PROOF_DOC BLOB,
ADDRESS VARCHAR(250),
ST VARCHAR(50),
ZIP VARCHAR(30),
CNTRY VARCHAR(30),
MBL_NUM INT,
EMAIL_ID VARCHAR(250),
KYC_UPLD_IND VARCHAR(1),
REG_STATUS VARCHAR(20),
ADMIN_COMMENTS VARCHAR(300)
);

CREATE TABLE CUST_ACCT(
UCI INT NOT NULL PRIMARY KEY AUTO_INCREMENT = 1111111111111111,
REG_ID INT,
ACCT_NUM INT,
CUST_NM VARCHAR(200),
CUST_ACCT_TYP VARCHAR(30),
CRET_DT DATE,
ACCT_ST_DT DATE,
ACCT_CLS_DT DATE,
ACCT_STATUS VARCHAR(50),
BRANCH_ID INT(10),
FOREIGN KEY (REG_ID) REFERENCES KYC_DTL(REG_ID),
FOREIGN KEY (BRANCH_ID) REFERENCES BRANCH_DTL(BRANCH_ID)
);

CREATE TABLE PWD_DTL(
PWD_ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT = 100,
CRET_DT DATE,
UCI INT,
REG_ID INT,
LOGIN_PWD VARCHAR(30),
LCK_IND VARCHAR(1) DEFAULT = 'N',
SECURITY_QUEST VARCHAR(300),
SECURITY_ANS VARCHAR(300),
FOREIGN KEY (UCI) REFERENCES CUST_ACCT(UCI)
);

CREATE TABLE ACCT_TXN_INFO(
TXN_ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT = 100,
UCI INT,
ACCT_NUM INT,
CRET_DT DATE,
TXN_AMT FLOAT(10,2),
TXN_TYP VARCHAR(20),
AVL_BAL FLOAT(10,2),
ST_DTM TIMESTAMP,
END_DTM TIMESTAMP,
PAYMNT_FRM VARCHAR(10),
PAYMNT_TO VARCHAR(100),
TXN_COMMENTS VARCHAR(250),
FOREIGN KEY (UCI,ACCT_NUM) REFERENCES CUST_ACCT(UCI,ACCT_NUM)
);

CREATE TABLE CUST_BNFCRY(
BNFCRY_ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT = 100, 
BNFCRY_ACCT_NUM INT,
BNFCRY_TYP VARCHAR(30),
BNFCRY_ACCT_NM VARCHAR(250),
BNFCRY_ACCT_BNK VARCHAR(300),
BNFCRY_ACCT_IFSC VARCHAR(30),
CRET_DT DATE,
MDFYD_DT DATE,
BNFCRY_MBL_NUM INT
);

CREATE TABLE SERVICE_PROVIDER(
SVC_PRVDR_ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT = 100,
UCI INT,
SVC_PRVDR_NM VARCHAR(250),
BNK_NM VARCHAR(300),
ACCT_NUM INT, 
BRANCH_ID INT,
SVC_ST_DT DATE,
SVC_END_DT DATE,
FOREIGN KEY (UCI) REFERENCES CUST_ACCT(UCI),
FOREIGN KEY (BRANCH_ID) REFERENCES BRANCH_DTL(BRANCH_ID)
);

CREATE TABLE INTEREST_RATES(
INTRST_ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT = 100,
INTRST_TYP VARCHAR(30),
STATUS VARCHAR(30),
CRET_DT DATE,
TIME_PERIOD INT,
INTEREST_RATE FLOAT(10,2),
LCKNG_PRD INT
);

CREATE TABLE LOAN_APPLICATION(
LOAN_APPL_ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT = 100,
UCI INT,
CUSTOMER_NM VARCHAR(250),
INTRST_ID INT,
PROOFS_SUBMITTED VARCHAR(50),
APPRVL_IND VARCHAR(1),
CRET_DT DATE,
LOAN_STATUS VARCHAR(30),
COMMENTS VARCHAR(300),
FOREIGN KEY (UCI) REFERENCES CUST_ACCT(UCI),
FOREIGN KEY (INTRST_ID) REFERENCES INTEREST_RATES(INTRST_ID)
);

CREATE TABLE LOAN_ACCOUNTS(
LOAN_ACCT_NUM INT NOT NULL PRIMARY KEY AUTO_INCREMENT = 100,
LOAN_APPL_ID INT,
UCI INT,
AMT_TAKEN FLOAT(10,2),
INTEREST_RATE FLOAT(10,2),
LOAN_ST_DT DATE,
LOAN_END_DT DATE,
SVC_PRVDR_ID INT,
FOREIGN KEY (UCI) REFERENCES CUST_ACCT(UCI),
FOREIGN KEY (LOAN_APPL_ID) REFERENCES LOAN_APPLICATION(LOAN_APPL_ID)
);

CRAETE TABLE LOAN_PAYMENT(
RETURN_ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT = 100,
LOAN_ACCCT_NUM INT,
AMT_PYMNT_DT DATE,
CAPITAL_PAID FLOAT(10,2),
INTEREST_PAID FLOAT(10,2)
REMARKS VARCHAR(300),
PRE_CLOSURE_REQ VARCHAR(20),
PRE_CLOSURE_IND VARCHAR(1),
FOREIGN KEY (LOAN_ACCCT_NUM) REFERENCES LOAN_ACCOUNTS(LOAN_ACCCT_NUM)
);
CREATE TABLE CARD_APPLICATION(
CARD_APPL_ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT = 100,
UCI INT,
ACCT_NUM INT,
CARD_APPL_DATE DATE,
CARD_APPL_TYPE VARCHAR(25)
CARD_TYPE VARCHAR(20),
CARD_NAME VARCHAR(50)
MONTHLY_INCOME FLOAT(10,2),
CARD_APPL_PROOFDOCS_IND VARCHAR(1),
CARD_APPROVAL_STATUS VARCHAR(10),
CARD_APPROVAL_IND VARCHAR(1),
CARD_APPROVAL_CMNTS VARCHAR(100),
FOREIGN KEY (UCI,ACCT_NUM) REFERENCES CUST_ACCT(UCI,ACCT_NUM)
);

CREATE TABLE CARD_DETAILS(
CARD_DTL_ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT = 100,
CARD_NUMBER INT,
ACCT_NUM INT,
PIN INT,
CVV INT,
CARD_END_DATE DATE,
FOREIGN KEY (ACCT_NUM) REFERENCES CUST_ACCT(ACCT_NUM)
);

CREATE TABLE CARD_INFO(
CARD_INFO_ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT = 100,
CARD_APPL_ID INT,
CARD_NUMBER INT,
CARD_DELIVERY_DATE DATE
AVAILABLE_BAL FLOAT(10,2),
CARD_ACTIVE_IND VARCHAR(1),
CARD_ACTIVE_STATUS VARCHAR(10),
CARD_ACTIVE_COMMENTS VARCHAR(100),
CARD_STATUS VARCHAR(20),
FOREIGN KEY (CARD_APPL_ID) REFERENCES CARD_APPLICATION(CARD_APPL_ID),
FOREIGN KEY (CARD_NUMBER) REFERENCES CARD_DETAILS(CARD_NUMBER)
);

CREATE TABLE CARD_PAYMENT(
CARD_PYMNT_ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT = 100,
CARD_NUMBER INT,
ACCT_NUM INT,
AMOUNT_PAID FLOAT(10,2),
PAYMENT_DATE DATE,
COMMENTS VARCHAR(100),
FOREIGN KEY (CARD_NUMBER) REFERENCES CARD_DETAILS(CARD_NUMBER),
FOREIGN KEY (ACCT_NUM) REFERENCES CUST_ACCT(ACCT_NUM)
);

CREATE TABLE CARD_SERVICEREQUESTS(
SERVICEREQ_NUM INT NOT NULL PRIMARY KEY AUTO_INCREMENT = 100,
CARD_NUMBER INT,
ACCT_NUM INT,
SERVICE_REQ_TYPE VARCHAR(30),
SERVICE_REQ_DESCRIPTION VARCHAR(80),
REPORTED_DATE DATE,
SERVICE_REQ_STATUS VARCHAR(30),
COMPLETED_DATE DATE,
ACTION_TAKEN VARCHAR(80),
FOREIGN KEY (CARD_NUMBER) REFERENCES CARD_DETAILS(CARD_NUMBER),
FOREIGN KEY (ACCT_NUM) REFERENCES CUST_ACCT(ACCT_NUM)
);
