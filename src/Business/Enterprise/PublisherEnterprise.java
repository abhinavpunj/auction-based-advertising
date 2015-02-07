/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import Business.Consumer.Consumer;
import Business.Exchange.Exchange;
import Business.Exchange.WinningBids;
import Business.FinanceAccount.PublisherAccount;
import Business.Logger.Logging;
import Business.Publisher.AdPriceRule;
import Business.Publisher.AdSpaceInventory;
import Business.Publisher.SupplySidePlatform;
import Business.Role.Role;
import Business.WorkRequest.InvoiceRequest;
import java.util.ArrayList;

/**
 *
 * @author Abhinav
 */
public class PublisherEnterprise extends Enterprise
{
    private AdSpaceInventory adSpaceInventory;
    private SupplySidePlatform ssp;
    private AdPriceRule rule;
    private Consumer consumer;
    private Exchange exchange;
    private PublisherAccount account;
    private Logging logging = Logging.getLoggerInstance();

    public PublisherEnterprise(String name, Exchange exchange) {
        super(name, EnterpriseType.Publisher);
        this.exchange = exchange;
        adSpaceInventory = new AdSpaceInventory();
        rule = new AdPriceRule();
        ssp = new SupplySidePlatform(adSpaceInventory, exchange, rule);
        account = new PublisherAccount();
        getFinanceAccountDirectory().getFinanceAccountDirectory().add(account);
    }
    
    public void generateInvoice()
    {
        logging.logMessage("Invoice Generation started", Logging.INFO);
        for(WinningBids wb : exchange.getBidsWon())
        {
            MarketingAgencyEnterprise agencyEnterprise = wb.getAdvertiserEnterprise().getAgency();
            InvoiceRequest request = new InvoiceRequest();
            request.setPublisherEnterprise(this);
            request.setAdvertiserEnterprise(wb.getAdvertiserEnterprise());
            request.setAgencyEnterprise(agencyEnterprise);
            request.setPublisherPrice(wb.getAdvertiserEnterprise().getRule().getBidAmount());
            request.setStatus("Pending");
            logging.logMessage("Invoice generated for " + wb.getAdvertiserEnterprise().getName(), Logging.INFO);
            float agencyPrice = agencyEnterprise.chargeCommission(request.getPublisherPrice());
            request.setAgencyPrice(agencyPrice);
            agencyEnterprise.getWorkQueue().getWorkQueue().add(request);
            wb.getAdvertiserEnterprise().getWorkQueue().getWorkQueue().add(request);
            this.getWorkQueue().getWorkQueue().add(request);
            logging.logMessage("Invoice added to " + wb.getAdvertiserEnterprise().getName() + "'s pending payments", Logging.INFO);
        }
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public AdSpaceInventory getAdSpaceInventory() {
        return adSpaceInventory;
    }

    public SupplySidePlatform getSsp() {
        return ssp;
    }

    public Consumer getConsumer() {
        return consumer;
    }

    public void setConsumer(Consumer consumer) {
        this.consumer = consumer;
    }

    public AdPriceRule getRule() {
        return rule;
    }

    public PublisherAccount getAccount() {
        return account;
    }   
    
    
}
