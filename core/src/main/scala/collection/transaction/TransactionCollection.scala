package collection.transaction

import java.util.Calendar

import model.account.Account
import model.transaction.Transaction

import scala.collection.mutable


class TransactionCollection(account: Account) {

  var transactons: List[Transaction] = TransactionCollection.generateSomeTransactions(account)


}

object TransactionCollection {

  def generateSomeTransactions(account: Account): List[Transaction] = {

    val transactionList: mutable.ListBuffer[Transaction] = mutable.ListBuffer()
    val secondAccount: Account = new Account("secondAccount", "Just to Test some shit")

    for (x <- (1 to 5).toList) {
      transactionList += Transaction(x * 145.67, account, secondAccount, Calendar.getInstance(), Calendar.getInstance())
    }

    transactionList.toList
  }
}